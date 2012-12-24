package br.com.alexandre.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class BlogTest {

	@Test
	public void testGetId() {
		final Long id = 1L;
		
		final Blog blog = new Blog();
		blog.setId(1L);
		
		assertNotNull(blog.getId());
		assertEquals(id, blog.getId());
	}

	@Test
	public void testGetName() {
		final String name = "My Blog";
		
		final Blog blog = new Blog();
		blog.setName("My Blog");
		
		assertNotNull(blog.getName());
		assertEquals(name, blog.getName());
	}

	@Test
	public void testGetUrl() {
		final String url = "http://www.myblog.com.br";
		
		final Blog blog = new Blog();
		blog.setUrl("http://www.myblog.com.br");
		
		assertNotNull(blog.getUrl());
		assertEquals(url, blog.getUrl());
	}

}
