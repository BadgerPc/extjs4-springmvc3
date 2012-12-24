package br.com.alexandre.vo;

import java.io.Serializable;

import br.com.alexandre.model.Book;

public class BookVO implements Serializable {
	private static final long serialVersionUID = 3175963485651852769L;
	
	private final Long id;
	private final String title;
	private final Integer pages;
	private final Integer numChapters;
	private final Long authorId;
	
	public BookVO(final Book book) {
		if (book == null) {
			throw new IllegalArgumentException("Book is null");
		}
		
		this.id = book.getId();
		this.title = book.getTitle();
		this.pages = book.getPages();
		this.numChapters = book.getNumChapters();		
		this.authorId = (book.getAuthor() != null)? book.getAuthor().getId(): null;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getPages() {
		return pages;
	}

	public Integer getNumChapters() {
		return numChapters;
	}

	public Long getAuthorId() {
		return authorId;
	}
	
	
	
}
