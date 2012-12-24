package br.com.alexandre.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estado implements Serializable {

	private static final long serialVersionUID = 393161385331791559L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String sigla;	
	private String descricao;
		
	public Estado() {		
	}
		
	public Estado(String sigla, String descricao) {
		this.sigla = sigla;
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Estado [sigla=" + sigla + ", descricao=" + descricao + "]";
	}
	
	
}
