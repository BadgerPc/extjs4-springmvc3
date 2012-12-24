package br.com.alexandre.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class ChapterTest {

	@Test
	public void testGetId() {
		final Long id = 1L;
		
		final Chapter chapter = new Chapter();
		chapter.setId(1L);
		
		assertNotNull(chapter.getId());
		assertEquals(id, chapter.getId());
	}

	@Test
	public void testGetNumber() {
		final Integer number = 1;
		
		final Chapter chapter = new Chapter();
		chapter.setNumber(1);
		
		assertNotNull(chapter.getNumber());
		assertEquals(number, chapter.getNumber());
	}

	@Test
	public void testGetTitle() {
		final String title = "Spring MVC 3";
		
		final Chapter chapter = new Chapter();
		chapter.setTitle("Spring MVC 3");
		
		assertNotNull(chapter.getTitle());
		assertEquals(title, chapter.getTitle());
	}

	@Test
	public void testGetBook() {
		final Book b = new Book();
		
		final Chapter chapter = new Chapter();
		chapter.setBook(b);
		
		assertNotNull(chapter.getBook());
	}

}
