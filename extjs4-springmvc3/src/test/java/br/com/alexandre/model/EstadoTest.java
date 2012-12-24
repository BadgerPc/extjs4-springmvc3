package br.com.alexandre.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class EstadoTest {

	@Test
	public void testGetId() {
		final Long id = 1L;
		
		final Estado estado = new Estado();
		estado.setId(1L);
		
		assertNotNull(estado.getId());
		assertEquals(id, estado.getId());		
	}

	@Test
	public void testGetSigla() {
		final String sigla = "SP";
		
		final Estado estado = new Estado();
		estado.setSigla("SP");
		
		assertNotNull(estado.getSigla());
		assertEquals(sigla, estado.getSigla());
	}

	@Test
	public void testGetDescricao() {
		final String descricao = "São Paulo";
		
		final Estado estado = new Estado();
		estado.setDescricao("São Paulo");
		
		assertNotNull(estado.getDescricao());
		assertEquals(descricao, estado.getDescricao());
	}

}
