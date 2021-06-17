package models;

public class Cliente extends Pessoa{
	
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return super.toString() + " | E-mail: " + getEmail();
	}
	
}











