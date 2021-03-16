
// Modificador de acesso - public, private e protected
public class Cliente {
	
	//Caracter�stica, atributo ou propriedade
	//O atributo dentro de uma classe de modelo, sempre deve ser privado!
	private String nome;
	private String cpf;
	
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
}