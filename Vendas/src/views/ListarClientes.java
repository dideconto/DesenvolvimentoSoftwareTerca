package views;

import controllers.PessoaController;
import models.Cliente;
import models.Pessoa;

public class ListarClientes {
	
	private static PessoaController controller = PessoaController.retornarInstancia();
	
	public static void renderizar(){
		System.out.println("\n".repeat(15));
		System.out.println("\n-- LISTAR CLIENTES --\n");
		for (Pessoa pessoaCadastrada : controller.listar()) {
			if(pessoaCadastrada instanceof Cliente)
				System.out.println(pessoaCadastrada);
		}
	}
	
}
