package br.com.alexandre.repository;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import br.com.alexandre.model.Chapter;

public class ChapterRepository extends HibernateDaoSupport {
	@Transactional
	public Chapter read(final Long id) {
		return getHibernateTemplate().get(Chapter.class, id);
	}
}
