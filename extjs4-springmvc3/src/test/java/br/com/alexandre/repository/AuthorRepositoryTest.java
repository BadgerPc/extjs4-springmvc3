package br.com.alexandre.repository;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.orm.hibernate3.HibernateTemplate;

import br.com.alexandre.model.Author;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class AuthorRepositoryTest {

	@Mock
	private HibernateTemplate hibernateTemplate;
	
	private AuthorRepository authorRepository;
	
	@Before
	public void setUp() {
		this.authorRepository = new AuthorRepository();
		this.authorRepository.setHibernateTemplate(hibernateTemplate);
	}
	
	@Test
	public void testRead() {
		when(hibernateTemplate.get(Author.class, 1L)).thenReturn(new Author());
		
		final Author author = authorRepository.read(1L);
		
		verify(hibernateTemplate, times(1)).get(Author.class, 1L);
		
		assertNotNull(author);
	}

}
