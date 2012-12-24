package br.com.alexandre.vo;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.alexandre.model.Author;
import br.com.alexandre.model.Book;

public class BookVOTest {

	@Test
	public void testGetId() {
		final Book book = new Book();
		book.setId(1L);
		
		final BookVO bookVO = new BookVO(book);
		
		assertNotNull(bookVO.getId());
		assertEquals(book.getId(), bookVO.getId());
	}

	@Test
	public void testGetTitle() {
		final Book book = new Book();
		book.setTitle("Código Limpo");
		
		final BookVO bookVO = new BookVO(book);
		
		assertNotNull(bookVO.getTitle());
		assertEquals(book.getTitle(), bookVO.getTitle());		
	}

	@Test
	public void testGetPages() {
		final Book book = new Book();
		book.setPages(100);
		
		final BookVO bookVO = new BookVO(book);
		
		assertNotNull(bookVO.getPages());		
		assertEquals(book.getPages(), bookVO.getPages());
	}

	@Test
	public void testGetNumChapters() {
		final Book book = new Book();
		book.setNumChapters(11);
		
		final BookVO bookVO = new BookVO(book);
		
		assertNotNull(bookVO.getNumChapters());
		assertEquals(book.getNumChapters(), bookVO.getNumChapters());
	}

	@Test
	public void testGetAuthorId() {
		final Author author = new Author();
		author.setId(1L);
		
		final Book book = new Book();
		book.setAuthor(author);
		
		final BookVO bookVO = new BookVO(book);
		
		assertNotNull(bookVO.getAuthorId());
		assertEquals(book.getAuthor().getId(), bookVO.getAuthorId());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testNull() {
		new BookVO(null);
	}

}
