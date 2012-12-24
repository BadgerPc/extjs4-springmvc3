package br.com.alexandre.vo;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.alexandre.model.Book;
import br.com.alexandre.model.Chapter;

public class ChapterVOTest {

	@Test
	public void testGetId() {
		final Chapter chapter = new Chapter();
		chapter.setId(1L);
		
		final ChapterVO chapterVO = new ChapterVO(chapter);
		
		assertNotNull(chapterVO.getId());
		assertEquals(chapter.getId(), chapterVO.getId());
	}

	@Test
	public void testGetNumber() {
		final Chapter chapter = new Chapter();
		chapter.setNumber(5);
		
		final ChapterVO chapterVO = new ChapterVO(chapter);
		
		assertNotNull(chapterVO.getNumber());
		assertEquals(chapter.getNumber(), chapterVO.getNumber());
	}

	@Test
	public void testGetTitle() {
		final Chapter chapter = new Chapter();
		chapter.setTitle("A interface EntityManager");
		
		final ChapterVO chapterVO = new ChapterVO(chapter);
		
		assertNotNull(chapterVO.getTitle());
		assertEquals(chapter.getTitle(), chapterVO.getTitle());
	}

	@Test
	public void testGetBookId() {
		final Book book = new Book();
		book.setId(1L);
		
		final Chapter chapter = new Chapter();
		chapter.setBook(book);
		
		final ChapterVO chapterVO = new ChapterVO(chapter);
		
		assertNotNull(chapterVO.getBookId());
		assertEquals(chapter.getBook().getId(), chapterVO.getBookId());
	}

	@Test(expected=IllegalArgumentException.class)
	public void testNull() {
		new ChapterVO(null);
	}
}
