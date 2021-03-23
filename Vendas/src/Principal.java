import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		int opcao;
		Scanner sc = new Scanner(System.in);
		Cliente cliente = new Cliente();	
		ArrayList<Cliente> clientes = new ArrayList<Cliente>(); 
		
		do {			
			System.out.println("\n-- PROJETO DE VENDAS --  ");
			System.out.println("\n1 - Cadastrar cliente");
			System.out.println("2 - Listar clientes");
			System.out.println("0 - Sair");
			System.out.println("\nDigite a opção desejada: ");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:	
				System.out.println("\n-- CADASTRAR CLIENTE --  \n");				
				System.out.println("Digite o nome do cliente:");	
				cliente.setNome(sc.next());					
				System.out.println("Digite o CPF do cliente:");	
				cliente.setCpf(sc.next());	
				clientes.add(cliente);
				System.out.println("\nCliente cadastrado com sucesso!");
				break;
			case 2:	
				System.out.println("\n-- LISTAR CLIENTES --  \n");	
				System.out.println(clientes);
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

}
