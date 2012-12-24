package br.com.alexandre.model;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class BookTest {

	@Test
	public void testGetId() {
		final Long id = 1L;
		
		final Book book = new Book();
		book.setId(1L);
		
		assertNotNull(book.getId());
		assertEquals(id, book.getId());
	}

	@Test
	public void testGetTitle() {
		final String title = "Java Concorrente na Prática";
		
		final Book book = new Book();
		book.setTitle("Java Concorrente na Prática");
		
		assertNotNull(book.getTitle());
		assertEquals(title, book.getTitle());
	}

	@Test
	public void testGetPages() {
		final Integer pages = 100;
		
		final Book book = new Book();
		book.setPages(100);
		
		assertNotNull(book.getPages());
		assertEquals(pages, book.getPages());
	}

	@Test
	public void testGetNumChapters() {
		final Integer numChapters = 12;
		
		final Book book = new Book();
		book.setNumChapters(12);
		
		assertNotNull(book.getNumChapters());
		assertEquals(numChapters, book.getNumChapters());
	}

	@Test
	public void testGetAuthor() {
		final Book book = new Book();
		
		final Author author = new Author();
		author.setId(1L);
		author.setName("Doug Lea");
		
		book.setAuthor(author);
		
		assertNotNull(book.getAuthor());
	}

	@Test
	public void testGetChapters() {
		final Book book = new Book();
		final Set<Chapter> chapters = new HashSet<Chapter>();
		
		book.setChapters(chapters);
		
		assertNotNull(book.getChapters());
	}

}
