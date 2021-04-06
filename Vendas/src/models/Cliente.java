package models;
import java.util.Date;

// Modificador de acesso - public, private e protected
public class Cliente {

	public Cliente() {
		this.criadoEm = new Date();
	}
	
	//Característica, atributo ou propriedade
	//O atributo dentro de uma classe de modelo, sempre deve ser privado!
	private String nome;
	private String cpf;
	private Date criadoEm;
	
	//Getters and Setters
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
