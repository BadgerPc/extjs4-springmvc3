package br.com.alexandre.model;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class ClienteTest {

	@Test
	public void testGetId() {
		final Long id = 1L;
		
		final Cliente cliente = new Cliente();
		cliente.setId(1L);
		
		assertNotNull(cliente.getId());
		assertEquals(id, cliente.getId());
	}

	@Test
	public void testGetNome() {
		final String nome = "Alexandre";
		
		final Cliente cliente = new Cliente();
		cliente.setNome("Alexandre");
		
		assertNotNull(cliente.getNome());
		assertEquals(nome, cliente.getNome());
	}

	@Test
	public void testGetSexo() {
		final String sexo = "M";
		
		final Cliente cliente = new Cliente();
		cliente.setSexo("M");
		
		assertNotNull(cliente.getSexo());
		assertEquals(sexo, cliente.getSexo());
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testGetDataNascimento() {
		final Date dataNascimento = new Date(1986, 11, 16, 12, 25, 00);
		
		final Cliente cliente = new Cliente();
		cliente.setDataNascimento(new Date(1986,11,16,12,25,00));
		
		assertNotNull(cliente.getDataNascimento());
		assertEquals(dataNascimento, cliente.getDataNascimento());
	}

	@Test
	public void testGetRg() {
		final String rg = "45.455.255-5";
		
		final Cliente cliente = new Cliente();
		cliente.setRg("45.455.255-5");
		
		assertNotNull(cliente.getRg());
		assertEquals(rg, cliente.getRg());
	}

	@Test
	public void testGetEmissor() {
		final String emissor = "SSP/SP";
		
		final Cliente cliente = new Cliente();
		cliente.setEmissor("SSP/SP");
		
		assertNotNull(cliente.getEmissor());
		assertEquals(emissor, cliente.getEmissor());
	}

	@Test
	public void testGetCpf() {
		final String cpf = "458.895.444-56";
		
		final Cliente cliente = new Cliente();
		cliente.setCpf("458.895.444-56");
		
		assertNotNull(cliente.getCpf());
		assertEquals(cpf, cliente.getCpf());
	}

	@Test
	public void testGetCep() {
		final String cep = "05965-889";
		
		final Cliente cliente = new Cliente();
		cliente.setCep("05965-889");
		
		assertNotNull(cliente.getCep());
		assertEquals(cep, cliente.getCep());
	}

	@Test
	public void testGetLogradouro() {
		final String logradouro = "Avenida Paes de Barros, 4485";
		
		final Cliente cliente = new Cliente();
		cliente.setLogradouro("Avenida Paes de Barros, 4485");
		
		assertNotNull(cliente.getLogradouro());
		assertEquals(logradouro, cliente.getLogradouro());
	}

	@Test
	public void testGetComplemento() {
		final String complemento = "Apartamento 7";
		
		final Cliente cliente = new Cliente();
		cliente.setComplemento(complemento);
		
		assertNotNull(cliente.getComplemento());
		assertEquals(complemento, cliente.getComplemento());
	}

	@Test
	public void testGetCidade() {
		final String cidade = "São Paulo";
		
		final Cliente cliente = new Cliente();
		cliente.setCidade("São Paulo");
		
		assertNotNull(cliente.getCidade());
		assertEquals(cidade, cliente.getCidade());
	}

	@Test
	public void testGetBairro() {
		final String bairro = "Mooca";
		
		final Cliente cliente = new Cliente();
		cliente.setBairro("Mooca");
		
		assertNotNull(cliente.getBairro());
		assertEquals(bairro, cliente.getBairro());
	}

	@Test
	public void testGetEstado() {
		final String estado = "SP";
		
		final Cliente cliente = new Cliente();
		cliente.setEstado("SP");
		
		assertNotNull(cliente.getEstado());
		assertEquals(estado, cliente.getEstado());
	}

}
