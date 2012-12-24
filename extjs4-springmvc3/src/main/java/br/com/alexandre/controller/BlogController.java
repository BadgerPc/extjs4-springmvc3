package br.com.alexandre.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.alexandre.model.Blog;
import br.com.alexandre.repository.BlogRepository;

@Controller
public class BlogController {

	private final Logger logger = Logger.getLogger(getClass()); 
	
	private final BlogRepository blogRepository;
	
	@Autowired
	public BlogController(final BlogRepository blogRepository) {
		this.blogRepository = blogRepository;
	}
		
	@RequestMapping(method=RequestMethod.POST, value="/blogs", consumes={"application/json"})
	@ResponseBody
	public Blog create(@RequestBody Blog blog) {
		logger.info("Executando metodo POST no recurso blogs");
		
		blog = blogRepository.create(blog);
		
		logger.info("Finalizando metodo POST no recurso blogs");
				
		return blog;
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/blogs/{id}", produces={"application/json"})
	@ResponseBody
	public Blog read(@PathVariable final Long id) {
		logger.info("Executando metodo GET no recurso blogs");		
		logger.info("Path Variable id: " + id);
		
		final Blog blog = blogRepository.read(id);
		
		logger.info("Finalizando metodo GET no recurso blogs");
		
		return blog;
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/blogs", produces={"application/json"})
	@ResponseBody
	public List<Blog> findAll() {
		logger.info("Executando metodo GET no recurso blogs");		
		
		final List<Blog> blogs = blogRepository.findAll();

		logger.info("Finalizando metodo GET no recurso blogs");
		
		return blogs;
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/blogs/{id}", consumes={"application/json"})
	@ResponseBody
	public Blog update(@PathVariable final Long id, @RequestBody Blog blog) {
		logger.info("Executando metodo PUT no recurso blogs");
		
		blog = blogRepository.update(blog);		
		
		logger.info("Finalizando metodo PUT no recurso blogs");
		
		return blog;
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/blogs/{id}")
	@ResponseBody
	public Blog delete(@PathVariable final Long id, @RequestBody Blog blog) {
		logger.info("Executando metodo DELETE no recurso blogs");
		
		blog = blogRepository.delete(blog);
		
		logger.info("Finalizando metodo DELETE no recurso blogs");
		
		return blog;
	}

}
