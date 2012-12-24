package br.com.alexandre.repository;

import org.apache.log4j.Logger;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import br.com.alexandre.model.Cliente;

public class ClienteRepository extends HibernateDaoSupport {
	private Logger logger = Logger.getLogger(getClass());
	
	@Transactional
	public Cliente create(final Cliente cliente) {
		getHibernateTemplate().save(cliente);
		logger.info("Cliente: " + cliente);
		return cliente;
	}
	
	
}
