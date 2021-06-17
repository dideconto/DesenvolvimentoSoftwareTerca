package models;

import java.util.Date;

public class Produto {
	
	public Produto() {
		setCriadoEm(new Date());
	}
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	private String nome;
	private double preco;
	private int quantidade;
	private Date criadoEm;
	
	public Date getCriadoEm() {
		return criadoEm;
	}
	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double valor) {
		this.preco = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Nome: " + getNome() + " | Valor: " + getPreco() + " | Quantidade: " + getQuantidade() + 
				" | Criado em: " + criadoEm;
	}	
}
