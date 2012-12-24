package br.com.alexandre.repository;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.orm.hibernate3.HibernateTemplate;

import br.com.alexandre.model.Book;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class BookRepositoryTest {

	@Mock
	private HibernateTemplate hibernateTemplate;
	
	private BookRepository bookRepository;
	
	@Before
	public void setUp() {
		this.bookRepository = new BookRepository();
		this.bookRepository.setHibernateTemplate(hibernateTemplate);
	}
	
	@Test
	public void test() {
		when(hibernateTemplate.get(Book.class, 1L)).thenReturn(new Book());
		
		final Book book = bookRepository.read(1L);
		
		verify(hibernateTemplate, times(1)).get(Book.class, 1L);
		
		assertNotNull(book);
	}

}
