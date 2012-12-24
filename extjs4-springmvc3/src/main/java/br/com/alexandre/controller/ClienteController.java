package br.com.alexandre.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.alexandre.model.Resposta;
import br.com.alexandre.model.Cliente;
import br.com.alexandre.repository.ClienteRepository;

@Controller
public class ClienteController {
	private Logger logger = Logger.getLogger(getClass());
	
	private final ClienteRepository clienteRepository;
	
	@Autowired
	public ClienteController(final ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	@RequestMapping(method = RequestMethod.POST,  value="/clientes", consumes="application/x-www-form-urlencoded", produces="application/json")
	@ResponseBody
	public Resposta create(@ModelAttribute final Cliente cliente) {
		logger.info("Iniciando metodo POST sobre o recurso cliente");
		
		clienteRepository.create(cliente);
		
		logger.info("Finalizando metodo POST sobre o recurso cliente");
		
		return new Resposta(true, "Cliente cadastrado com sucesso");
	}

}
