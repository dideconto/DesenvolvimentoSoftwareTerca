package heranca;

public class Livro extends MidiaFisica{
	
	private String Isbn;

	public String getIsbn() {
		return Isbn;
	}

	public void setIsbn(String isbn) {
		Isbn = isbn;
	}

	@Override
	public String toString() {
		return super.toString() + "\nIsbn: " + Isbn;
	}

	
}
