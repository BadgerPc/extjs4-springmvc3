package br.com.alexandre.repository;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import br.com.alexandre.model.Blog;

public class BlogRepository extends HibernateDaoSupport {
	
	private Logger logger = Logger.getLogger(getClass());

	@Transactional
	public Blog create(final Blog blog) {		
		getHibernateTemplate().save(blog);
		
		logger.info("Blog: " + blog);
		
		return blog;
	}

	@Transactional
	public Blog read(final Long id) {
		final Blog blog = getHibernateTemplate().get(Blog.class, id);
		
		logger.info("Blog: " + blog);
		
		return blog;
	}

	@Transactional
	@SuppressWarnings("unchecked")
	public List<Blog> findAll() {
		List<Blog> all = getHibernateTemplate().find("Select b From Blog b");
		return all;
	}

	@Transactional
	public Blog update(final Blog blog) {
		getHibernateTemplate().update(blog);
		
		logger.info("Blog: " + blog);
		
		return blog;
	}

	@Transactional
	public Blog delete(final Blog blog) {
		getHibernateTemplate().delete(blog);
		
		logger.info("Blog: " + blog);
		
		return blog;
	}

}
