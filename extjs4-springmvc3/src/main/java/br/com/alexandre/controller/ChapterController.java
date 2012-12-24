package br.com.alexandre.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.alexandre.model.Chapter;
import br.com.alexandre.repository.ChapterRepository;
import br.com.alexandre.vo.ChapterVO;

@Controller
public class ChapterController {

	private final ChapterRepository chapterRepository;
	
	@Autowired 
	public ChapterController(final ChapterRepository chapterRepository) {
		this.chapterRepository = chapterRepository;
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/chapters/{id}", produces={"application/json"})
	@ResponseBody
	public ChapterVO read(@PathVariable(value="id") final Long id) {
		final Chapter chapter = chapterRepository.read(id);
		return new ChapterVO(chapter);
	}
}
