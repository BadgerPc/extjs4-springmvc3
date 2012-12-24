package br.com.alexandre.repository;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.orm.hibernate3.HibernateTemplate;

import br.com.alexandre.model.Cliente;

@RunWith(MockitoJUnitRunner.class)
public class ClienteRepositoryTest {

	@Mock
	private HibernateTemplate hibernateTemplate;
	
	private ClienteRepository clienteRepository;
	
	@Before
	public void setUp() {
		this.clienteRepository = new ClienteRepository();
		this.clienteRepository.setHibernateTemplate(hibernateTemplate);
	}
	
	@Test
	public void testCreate() {
		final Cliente cliente = new Cliente();
		when(hibernateTemplate.save(cliente)).thenReturn(1L);
		
		final Cliente clienteCreated = clienteRepository.create(cliente);
		
		verify(hibernateTemplate, times(1)).save(cliente);
		
		assertNotNull(clienteCreated);
		assertEquals(cliente, clienteCreated);		
	}

}
