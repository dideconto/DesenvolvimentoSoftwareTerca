package models;

import java.util.Date;

public class Vendedor {

	public Vendedor() {
		this.criadoEm = new Date();
	}

	private String nome;
	private String cpf;
	private Date criadoEm;

	public void setNome(String nome) {
		this.nome = nome;
	}	
	public String getNome() {
		return this.nome;
	}	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}	
	public String getCpf() {
		return this.cpf;
	}

	public Date getCriadoEm() {
		return criadoEm;
	}
	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + " | CPF: " + cpf + " | Criado em: " + criadoEm;
	}
}
