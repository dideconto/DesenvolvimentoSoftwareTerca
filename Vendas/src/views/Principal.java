package views;
import java.util.ArrayList;
import java.util.Scanner;

import models.Cliente;


public class Principal {
	
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>(); 
	private static Cliente cliente = new Cliente();	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int opcao;

		do {			
			System.out.println("\n-- PROJETO DE VENDAS --  ");
			System.out.println("\n1 - Cadastrar cliente");
			System.out.println("2 - Listar clientes");
			System.out.println("0 - Sair");
			System.out.println("\nDigite a opção desejada: ");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:	
				cadastrarCliente();
				break;
			case 2:	
				listarClientes();
				break;
			case 0:	
				System.out.println("\nSaindo...");			
				break;
			default:
				System.out.println("\nOpção inválida!");
				break;
			}
		} while (opcao != 0);		
		sc.close();

	}

	private static void listarClientes() {
		System.out.println("\n".repeat(20));
		System.out.println("\n-- LISTAR CLIENTES --  \n");
		for(Cliente clienteCadastrado : clientes) {
			System.out.println(clienteCadastrado);
		}
	}
	
	private static void cadastrarCliente() {
		System.out.println("\n".repeat(20));
		cliente = new Cliente();
		System.out.println("\n-- CADASTRAR CLIENTE --  \n");				
		System.out.println("Digite o nome do cliente:");	
		cliente.setNome(sc.next());					
		System.out.println("Digite o CPF do cliente:");	
		cliente.setCpf(sc.next());	
		boolean clienteEncontrado = false;
		if(clientes.size() > 0) {
			for(Cliente clienteCadastrado : clientes) {
				if(clienteCadastrado.getCpf().equals(cliente.getCpf())) {
					System.out.println("Esse cliente já existe!");
					clienteEncontrado = true;
					break;
				}
			}			
			if(!clienteEncontrado) {
				clientes.add(cliente);
				System.out.println("\nCliente cadastrado com sucesso!");
			}
		}else {			
			clientes.add(cliente);
			System.out.println("\nCliente cadastrado com sucesso!");
		}
	}
	
}
















