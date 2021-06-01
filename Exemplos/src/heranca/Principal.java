package heranca;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {		
		Livro livro = new Livro("Diogo Deconto");		
		livro.setCodigo(1);
		livro.setTitulo("Orienta��o a Objetos");
		livro.setCategoria("Tecnologia");
		livro.setPreco(75.5);
		livro.setEdicao(1);
		livro.setEditora("Deconto");
		livro.setPaginas(450);
		livro.setIsbn("13ASD@1CDG");
		
		System.out.println(livro.retornarTipo());
		System.out.println("\n" + livro);

		System.out.println("\n=======================================\n");
		
		Revista revista = new Revista("Jos� da Silva");		
		revista.setCodigo(1);
		revista.setTitulo("Revista de Orienta��o a Objetos");
		revista.setCategoria("Revista de Tecnologia");
		revista.setPreco(15);
		revista.setEdicao(135);
		revista.setEditora("Deconto Steinke");
		revista.setPaginas(67);
		revista.setReportagem("Heran�a na pr�tica!");
		
		System.out.println(revista.retornarTipo());
		System.out.println("\n" + revista);		
		
		ArrayList<Midia> midias = new ArrayList<Midia>();
		midias.add(revista);
		midias.add(livro);				

		for (Midia midia : midias) {
			System.out.println("\n=======================================\n");
			System.out.println(midia.retornarTipo());
		}
		
	}

}

//System.out.println("C�digo: " + livro.getCodigo());
//System.out.println("T�tulo: " + livro.getTitulo());
//System.out.println("Categoria: " + livro.getCategoria());
//System.out.println("Pre�o: " + livro.getPreco());
//System.out.println("Edi��o: " + livro.getEdicao());
//System.out.println("Editora: " + livro.getEditora());
//System.out.println("P�ginas: " + livro.getPaginas());
//System.out.println("ISBN: " + livro.getIsbn());
//System.out.println("Criado em: " + livro.getCriadoEm());







