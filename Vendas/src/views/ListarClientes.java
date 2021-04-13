package views;

import controllers.ClienteController;
import models.Cliente;

public class ListarClientes {

	public static void renderizar() {
		System.out.println("\n".repeat(20));
		System.out.println("\n-- LISTAR CLIENTES --  \n");
		for(Cliente clienteCadastrado : ClienteController.listar()) {
			System.out.println(clienteCadastrado);
		}
	}	
}
