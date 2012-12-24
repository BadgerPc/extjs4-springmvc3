package br.com.alexandre.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Blog implements Serializable {

	private static final long serialVersionUID = -5973075974394592615L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;	
	private String name;	
	private String url;
	
	public Blog() {		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Blog [id=" + id + ", name=" + name + ", url=" + url + "]";
	}
	
	
}
