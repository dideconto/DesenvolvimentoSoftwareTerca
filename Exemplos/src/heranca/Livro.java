package heranca;

public class Livro extends MidiaFisica{
	
	public Livro(String dono) {
		super(dono);
	}

	private String isbn;

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return super.toString() + "\nIsbn: " + isbn;
	}

	@Override
	public String retornarTipo() {
		return super.retornarTipo() + "Tipo Livro";
	}

	@Override
	public void obrigarImplementaçãoClasseFilha() {
		// TODO Auto-generated method stub
		
	}


	
}



