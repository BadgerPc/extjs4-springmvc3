package br.com.alexandre.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Book implements Serializable {

	private static final long serialVersionUID = -6358582200489627560L;

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String title;
	
	private Integer pages;
	
	private Integer numChapters;
	
	@ManyToOne
	@JoinColumn(name="authorId")
	private Author author;

	@OneToMany(mappedBy="book")
	private Set<Chapter> chapters = new HashSet<Chapter>();
	
	public Book() {		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public Integer getNumChapters() {
		return numChapters;
	}

	public void setNumChapters(Integer numChapters) {
		this.numChapters = numChapters;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Set<Chapter> getChapters() {
		return chapters;
	}

	public void setChapters(Set<Chapter> chapters) {
		this.chapters = chapters;
	}
	
	
}
