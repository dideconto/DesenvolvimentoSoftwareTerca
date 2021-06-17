package models;

import java.util.Date;

public abstract class Pessoa {
	
	//Construtor	
	public Pessoa() {
		setCriadoEm(new Date());
	}

	//Caracter�sticas, atributos ou propriedades
	private String nome;
	private String cpf;
	private Date criadoEm;
	
	//Getters and Setters
	//M�todo get do atributo nome
	public String getNome() {
		return this.nome;
	}	
	//M�todo set do atributo nome
	public void setNome(String nome) {
		this.nome = nome;
	}	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getCriadoEm() {
		return criadoEm;
	}
	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + " | CPF: " + getCpf() + " | Criado em: " + getCriadoEm();
	}
}
