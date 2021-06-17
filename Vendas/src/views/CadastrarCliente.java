package views;

import java.util.Scanner;

import controllers.PessoaController;
import models.Cliente;

public class CadastrarCliente {

	private static Scanner sc = new Scanner(System.in);
	private static PessoaController controller = PessoaController.retornarInstancia();
	private static Cliente cliente;

	public static void renderizar() {
		System.out.println("\n".repeat(15));
		cliente = new Cliente();
		System.out.println("\n-- CADASTRAR CLIENTE --\n");
		System.out.println("Digite o nome do cliente:");
		cliente.setNome(sc.nextLine());
		System.out.println("Digite o CPF do cliente:");
		cliente.setCpf(sc.nextLine());
		System.out.println("Digite o e-mail do cliente:");
		cliente.setEmail(sc.nextLine());
		if(controller.cadastrar(cliente)) {
			System.out.println("Cliente cadastrado com sucesso!");
		}else {
			System.out.println("Esse cliente j� existe!");
		}
	}
}








