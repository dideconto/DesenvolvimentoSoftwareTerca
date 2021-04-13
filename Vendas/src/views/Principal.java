package views;
import java.util.Scanner;

import models.Venda;


public class Principal {
	private static Scanner sc = new Scanner(System.in);
	Venda venda = new Venda();
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
				CadastrarCliente.renderizar();
				break;
			case 2:	
				ListarClientes.renderizar();
				break;
			case 0:	
				System.out.println("\nSaindo...");			
				break;
			default:
				System.out.println("\nOpção inválida!");
				break;
			}
		} while (opcao != 0);	
	}
}
















