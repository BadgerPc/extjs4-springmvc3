package br.com.alexandre.repository;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.orm.hibernate3.HibernateTemplate;

import br.com.alexandre.model.Chapter;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class ChapterRepositoryTest {

	@Mock
	private HibernateTemplate hibernateTemplate;
	
	private ChapterRepository chapterRepository;
	
	@Before
	public void setUp() {
		this.chapterRepository = new ChapterRepository();
		this.chapterRepository.setHibernateTemplate(hibernateTemplate);
	}
	
	@Test
	public void testRead() {
		when(hibernateTemplate.get(Chapter.class, 1L)).thenReturn(new Chapter());
		
		final Chapter chapter = chapterRepository.read(1L);
		
		verify(hibernateTemplate, times(1)).get(Chapter.class, 1L);
		
		assertNotNull(chapter);
	}

}
