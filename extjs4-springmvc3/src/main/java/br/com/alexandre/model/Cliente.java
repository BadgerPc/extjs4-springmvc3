package br.com.alexandre.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Cliente implements Serializable {
	
	private static final long serialVersionUID = -5074171506259676241L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nome;
	private String sexo;
	
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	
	private String rg;
	private String emissor;
	private String cpf;
	private String cep;
	private String logradouro;
	private String complemento;
	private String cidade;
	private String bairro;
	private String estado;
	
	public Cliente() {		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getEmissor() {
		return emissor;
	}
	public void setEmissor(String emissor) {
		this.emissor = emissor;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", sexo=" + sexo
				+ ", dataNascimento=" + dataNascimento + ", rg=" + rg
				+ ", emissor=" + emissor + ", cpf=" + cpf + ", cep=" + cep
				+ ", logradouro=" + logradouro + ", complemento=" + complemento
				+ ", cidade=" + cidade + ", bairro=" + bairro + ", estado="
				+ estado + "]";
	}
	
	
}
