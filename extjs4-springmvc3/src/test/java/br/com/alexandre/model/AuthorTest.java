package br.com.alexandre.model;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.Test;

public class AuthorTest {

	@Test
	public void testGetId() {
		final Long id = 1L;
		
		final Author author = new Author();
		author.setId(1L);
		
		assertNotNull(author.getId());
		assertEquals(id, author.getId());
		
	}

	@Test
	public void testGetName() {
		final String name = "Eric Evans";
		
		final Author author = new Author();
		author.setName("Eric Evans");
		
		assertNotNull(author.getName());
		assertEquals(name, author.getName());
	}

	@Test
	public void testGetBooks() {
		final Author author = new Author();
		author.setBooks(new HashSet<Book>());
		
		assertNotNull(author.getBooks());
	}

}
