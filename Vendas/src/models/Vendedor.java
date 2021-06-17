package models;

public class Vendedor extends Pessoa{
	private String telefone;
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return super.toString() + " | Telefone: " + getTelefone();
	}
}
