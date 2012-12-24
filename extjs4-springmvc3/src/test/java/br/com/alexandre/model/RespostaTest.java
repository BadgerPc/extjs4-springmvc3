package br.com.alexandre.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class RespostaTest {

	@Test
	public void testIsSuccess() {
		final boolean success = true;
		
		final Resposta resposta = new Resposta(success);
		
		assertNotNull(resposta.isSuccess());
		assertEquals(success, resposta.isSuccess());
	}

	@Test
	public void testGetMessage() {
		final String message = "Timeout";
		
		final Resposta resposta = new Resposta(false, message);
		
		assertNotNull(resposta.getMessage());
		assertEquals(message, resposta.getMessage());
		
	}

}
