package heranca;

public class Principal {

	public static void main(String[] args) {
		Livro livro = new Livro();
		
		livro.setCodigo(1);
		livro.setTitulo("Orienta��o a Objetos");
		livro.setCategoria("Tecnologia");
		livro.setPreco(75.5);
		livro.setEdicao(1);
		livro.setEditora("Deconto");
		livro.setPaginas(450);
		livro.setIsbn("13ASD@1CDG");
		
//		System.out.println("C�digo: " + livro.getCodigo());
//		System.out.println("T�tulo: " + livro.getTitulo());
//		System.out.println("Categoria: " + livro.getCategoria());
//		System.out.println("Pre�o: " + livro.getPreco());
//		System.out.println("Edi��o: " + livro.getEdicao());
//		System.out.println("Editora: " + livro.getEditora());
//		System.out.println("P�ginas: " + livro.getPaginas());
//		System.out.println("ISBN: " + livro.getIsbn());
//		System.out.println("Criado em: " + livro.getCriadoEm());
		
		System.out.println(livro);
		
	}

}







