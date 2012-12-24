package br.com.alexandre.vo;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.alexandre.model.Author;

public class AuthorVOTest {

	@Test
	public void testGetId() {
		final Author author = new Author();
		author.setId(1L);
		
		final AuthorVO authorVO = new AuthorVO(author);
		
		assertNotNull(authorVO.getId());
		assertEquals(author.getId(), authorVO.getId());
	}

	@Test
	public void testGetName() {
		final Author author = new Author();
		author.setName("Robert C. Martin");
		
		final AuthorVO authorVO = new AuthorVO(author);
		
		assertNotNull(authorVO.getName());
		assertEquals(author.getName(), authorVO.getName());		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testNull() {
		new AuthorVO(null);
	}

}
