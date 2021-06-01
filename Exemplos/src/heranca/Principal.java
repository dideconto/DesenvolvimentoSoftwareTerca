package heranca;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {		
		Livro livro = new Livro("Diogo Deconto");		
		livro.setCodigo(1);
		livro.setTitulo("Orientação a Objetos");
		livro.setCategoria("Tecnologia");
		livro.setPreco(75.5);
		livro.setEdicao(1);
		livro.setEditora("Deconto");
		livro.setPaginas(450);
		livro.setIsbn("13ASD@1CDG");
		
		System.out.println(livro.retornarTipo());
		System.out.println("\n" + livro);

		System.out.println("\n=======================================\n");
		
		Revista revista = new Revista("José da Silva");		
		revista.setCodigo(1);
		revista.setTitulo("Revista de Orientação a Objetos");
		revista.setCategoria("Revista de Tecnologia");
		revista.setPreco(15);
		revista.setEdicao(135);
		revista.setEditora("Deconto Steinke");
		revista.setPaginas(67);
		revista.setReportagem("Herança na prática!");
		
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

//System.out.println("Código: " + livro.getCodigo());
//System.out.println("Título: " + livro.getTitulo());
//System.out.println("Categoria: " + livro.getCategoria());
//System.out.println("Preço: " + livro.getPreco());
//System.out.println("Edição: " + livro.getEdicao());
//System.out.println("Editora: " + livro.getEditora());
//System.out.println("Páginas: " + livro.getPaginas());
//System.out.println("ISBN: " + livro.getIsbn());
//System.out.println("Criado em: " + livro.getCriadoEm());







