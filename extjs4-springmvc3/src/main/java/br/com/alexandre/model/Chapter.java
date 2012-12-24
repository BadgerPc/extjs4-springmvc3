package br.com.alexandre.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Chapter implements Serializable {

	private static final long serialVersionUID = -896905058794649577L;

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private Integer number;
	
	private String title;
	
	@ManyToOne
	@JoinColumn(name="bookId")
	private Book book;
	
	public Chapter() {		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	
}
