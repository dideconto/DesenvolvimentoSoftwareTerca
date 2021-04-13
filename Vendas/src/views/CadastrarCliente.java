package views;

import java.util.Scanner;

import controllers.ClienteController;
import models.Cliente;

public class CadastrarCliente {
	
	private static Cliente cliente;	
	private static Scanner sc = new Scanner(System.in);
	
	public static void renderizar() {
		cliente = new Cliente();
		System.out.println("\n".repeat(20));
		System.out.println("\n-- CADASTRAR CLIENTE --  \n");				
		System.out.println("Digite o nome do cliente:");	
		cliente.setNome(sc.next());					
		System.out.println("Digite o CPF do cliente:");	
		cliente.setCpf(sc.next());
		if(ClienteController.cadastrar(cliente)) {
			System.out.println("\nCliente cadastrado com sucesso!");
		}else {
			System.out.println("Esse cliente já existe!");
		}
	}
}









