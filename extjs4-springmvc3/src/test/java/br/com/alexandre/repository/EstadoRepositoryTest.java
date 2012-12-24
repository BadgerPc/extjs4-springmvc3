package br.com.alexandre.repository;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.orm.hibernate3.HibernateTemplate;

import br.com.alexandre.model.Estado;
import static org.mockito.Mockito.*;

;@RunWith(MockitoJUnitRunner.class)
public class EstadoRepositoryTest {

	@Mock
	private HibernateTemplate hibernateTemplate;
	
	private EstadoRepository estadoRepository;
	
	@Before
	public void setUp() {
		this.estadoRepository = new EstadoRepository();
		this.estadoRepository.setHibernateTemplate(hibernateTemplate);
	}
	
	@Test
	public void testFindAll() {
		final List<Estado> estados = new ArrayList<Estado>();
		estados.add(new Estado("AC","Acre")); 
		estados.add(new Estado("AL","Alagoas"));
		estados.add(new Estado("AM","Amazonas")); 
		estados.add(new Estado("AP","Amapá"));
		estados.add(new Estado("BA","Bahia"));
		estados.add(new Estado("CE","Ceará")); 
		estados.add(new Estado("DF","Distrito Federal"));
		estados.add(new Estado("ES","Espírito Santo"));
		estados.add(new Estado("GO","Goiás"));
		estados.add(new Estado("MA","Maranhão")); 
		estados.add(new Estado("MG","Minas Gerais"));
		estados.add(new Estado("MS","Mato Grosso do Sul"));
		estados.add(new Estado("MT","Mato Grosso"));
		estados.add(new Estado("PA","Pará"));
		estados.add(new Estado("PB","Paraíba")); 
		estados.add(new Estado("PE","Pernambuco")); 
		estados.add(new Estado("PI","Piauí")); 
		estados.add(new Estado("PR","Paraná"));
		estados.add(new Estado("RJ","Rio de Janeiro"));
		estados.add(new Estado("RN","Rio Grande do Norte"));
		estados.add(new Estado("RO","Rondônia"));
		estados.add(new Estado("RR","Roraima"));
		estados.add(new Estado("RS","Rio Grande do Sul"));
		estados.add(new Estado("SC","Santa Catarina"));
		estados.add(new Estado("SE","Sergipe"));
		estados.add(new Estado("SP","São Paulo"));
		estados.add(new Estado("TO","Tocantins"));
		
		String queryString = "Select e From Estado e Order By e.sigla";
		
		when(hibernateTemplate.find(queryString)).thenReturn(estados);
		
		final List<Estado> estadosRetrieved = estadoRepository.findAll();
		
		verify(hibernateTemplate, times(1)).find(queryString);
		
		assertNotNull(estadosRetrieved);
		assertEquals(estados.size(), estadosRetrieved.size());
		
	}

}
