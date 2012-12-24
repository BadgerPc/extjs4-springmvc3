package br.com.alexandre.repository;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.orm.hibernate3.HibernateTemplate;

import br.com.alexandre.model.Blog;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class BlogRepositoryTest {

	@Mock
	private HibernateTemplate hibernateTemplate;
	
	private BlogRepository blogRepository;
	
	@Before
	public void setUp() {
		blogRepository = new BlogRepository();
		blogRepository.setHibernateTemplate(hibernateTemplate);
	}
	
	@Test
	public void testCreate() {
		final Blog blog = new Blog();
		
		when(hibernateTemplate.save(blog)).thenReturn(1L);
		
		final Blog blogCreated = blogRepository.create(blog);
		
		verify(hibernateTemplate, times(1)).save(blog);
		
		assertEquals(blog, blogCreated);
	}

	@Test
	public void testRead() {
		final Long id = 1L;
		final String name = "Blog 1";
		final String url = "http://www.blog1.com.br";
		
		final Blog blog = new Blog();
		blog.setId(1L);
		blog.setName("Blog 1");
		blog.setUrl("http://www.blog1.com.br");
		
		when(hibernateTemplate.get(Blog.class, 1L)).thenReturn(blog);
		
		final Blog blogRetrieved = blogRepository.read(1L);
		
		verify(hibernateTemplate, times(1)).get(Blog.class, 1L);
		
		assertNotNull(blogRetrieved);
		assertEquals(id, blogRetrieved.getId());
		assertEquals(name, blogRetrieved.getName());
		assertEquals(url, blogRetrieved.getUrl());
	}

	@Test
	public void testFindAll() {
		final List<Blog> blogs = new ArrayList<Blog>();
		
		String queryString = "Select b From Blog b";
		
		when(hibernateTemplate.find(queryString)).thenReturn(blogs);
		
		final List<Blog> all = blogRepository.findAll();
				
		verify(hibernateTemplate, times(1)).find(queryString);
		
		assertNotNull(all);
	}

	@Test
	public void testUpdate() {		
		final Blog blog = new Blog();
		
		doNothing().when(hibernateTemplate).update(blog);
		
		final Blog blogUpdated = blogRepository.update(blog);
		
		verify(hibernateTemplate, times(1)).update(blog);
		
		assertNotNull(blogUpdated);
		assertEquals(blog, blogUpdated);
	}

	@Test
	public void testDelete() {
		final Blog blog = new Blog();
		
		doNothing().when(hibernateTemplate).delete(blog);
		
		final Blog blogDeleted = blogRepository.delete(blog);
		
		verify(hibernateTemplate, times(1)).delete(blog);
		
		assertNotNull(blogDeleted);
		assertEquals(blog, blogDeleted);
		
	}

}
