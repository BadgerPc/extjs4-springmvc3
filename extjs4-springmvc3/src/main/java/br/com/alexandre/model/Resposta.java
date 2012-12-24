package br.com.alexandre.model;

public class Resposta {
	private final boolean success;
	private final String message;
	
	public Resposta() {	
		this(true, null);
	}
	
	public Resposta(final boolean success) {
		this(success, null);
	}
	
	public Resposta(final boolean success, final String message) {
		this.success = success;
		this.message = message;
	}
	
	public boolean isSuccess() {
		return success;
	}
	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "Resposta [success=" + success + ", message=" + message + "]";
	}

}
