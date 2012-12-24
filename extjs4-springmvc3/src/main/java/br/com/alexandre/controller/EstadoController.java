package br.com.alexandre.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.alexandre.model.Estado;
import br.com.alexandre.repository.EstadoRepository;

@Controller
public class EstadoController {

	private final EstadoRepository estadoRepository;

	private Logger logger = Logger.getLogger(getClass());
	
	@Autowired
	public EstadoController(final EstadoRepository estadoRepository) {
		this.estadoRepository = estadoRepository;
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/estados", produces="application/json")
	@ResponseBody
	public List<Estado> findAll() {
		logger.info("Iniciando metodo GET sobre o recurso Estado");
		final List<Estado> all = estadoRepository.findAll();
		logger.info("Fianlizando metodo GET sobre o recurso Estado");
		return all;
	}
}
