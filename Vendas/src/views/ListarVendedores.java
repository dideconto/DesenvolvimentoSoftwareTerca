package views;

import controllers.PessoaController;
import models.Pessoa;
import models.Vendedor;

public class ListarVendedores {
	
	private static PessoaController controller = PessoaController.retornarInstancia();

	public static void renderizar() {
		System.out.println("\n".repeat(20));
		System.out.println("\n-- LISTAR VENDEDORES --  \n");
		for(Pessoa pessoaCadastrada : controller.listar()) {
			if(pessoaCadastrada instanceof Vendedor)
				System.out.println(pessoaCadastrada);
		}
	}	
}
