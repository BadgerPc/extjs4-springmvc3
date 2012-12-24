package br.com.alexandre.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.alexandre.model.Author;
import br.com.alexandre.repository.AuthorRepository;
import br.com.alexandre.vo.AuthorVO;

@Controller
public class AuthorController {

	private final AuthorRepository authorRepository;
	
	@Autowired
	public AuthorController(final AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/authors/{id}", produces={"application/json"})
	@ResponseBody
	public AuthorVO read(@PathVariable(value="id") final Long id) {
		final Author author = this.authorRepository.read(id);
		return new AuthorVO(author);
	}
}
