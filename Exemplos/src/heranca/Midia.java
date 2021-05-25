package heranca;

import java.util.Date;

public abstract class Midia {
	
	public Midia() {
		setCriadoEm(new Date());
	}
	
	private int codigo;
	private String titulo;
	private double preco;
	private String categoria;
	private Date criadoEm;
	
	public Date getCriadoEm() {
		return criadoEm;
	}
	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	@Override
	public String toString() {
		return "Código: " + codigo + "\nTítulo: " + titulo + "\nPreço: " + preco + "\nCategoria: " + categoria
				+ "\nCriado em: " + criadoEm;
	}
	
}
