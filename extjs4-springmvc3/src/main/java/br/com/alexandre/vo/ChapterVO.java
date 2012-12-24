package br.com.alexandre.vo;

import java.io.Serializable;

import br.com.alexandre.model.Chapter;

public class ChapterVO implements Serializable {

	private static final long serialVersionUID = -5756931974242613529L;
	
	private final Long id;
	private final Integer number;
	private final String title;
	private final Long bookId;

	public ChapterVO(final Chapter chapter) {
		if (chapter == null) {
			throw new IllegalArgumentException("Chapter is null");
		}		
		this.id = chapter.getId();
		this.number = chapter.getNumber();
		this.title = chapter.getTitle();
		this.bookId = (chapter.getBook() != null)? chapter.getBook().getId() : null;
	}

	public Long getId() {
		return id;
	}

	public Integer getNumber() {
		return number;
	}

	public String getTitle() {
		return title;
	}

	public Long getBookId() {
		return bookId;
	}
	
	
}
