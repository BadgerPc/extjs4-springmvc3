package br.com.alexandre.repository;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import br.com.alexandre.model.Estado;

public class EstadoRepository extends HibernateDaoSupport {
	private Logger logger = Logger.getLogger(getClass());
	
	@Transactional
	@SuppressWarnings("unchecked")
	public List<Estado> findAll() {
		final List<Estado> estados = (List<Estado>) getHibernateTemplate().find("Select e From Estado e Order By e.sigla");
		
		if (estados != null) {
			for (final Estado e : estados) {
				logger.info(e);
			}
		}		
		return estados;
	}
}
