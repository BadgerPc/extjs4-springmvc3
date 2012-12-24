package br.com.alexandre.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.alexandre.model.Book;
import br.com.alexandre.repository.BookRepository;
import br.com.alexandre.vo.BookVO;

@Controller
public class BookController {

	private final BookRepository bookRepository;
	
	@Autowired
	public BookController(final BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/books/{id}", produces={"application/json"})
	@ResponseBody
	public BookVO read(@PathVariable(value="id") final Long id) {
		final Book book = this.bookRepository.read(id);
		return new BookVO(book);
	}
}
