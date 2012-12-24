package br.com.alexandre.vo;

import java.io.Serializable;

import br.com.alexandre.model.Author;

public class AuthorVO implements Serializable {

	private static final long serialVersionUID = 7740751290657256938L;
	
	private final Long id;
	private final String name;
	
	public AuthorVO(final Author author) {
		if (author == null) {
			throw new IllegalArgumentException("Author is null");			
		}
		this.id = author.getId();
		this.name = author.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
}
