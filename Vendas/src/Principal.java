import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		int opcao;
		Scanner sc = new Scanner(System.in);
		Cliente cliente = new Cliente();		
		
		do {			
			System.out.println("\n-- PROJETO DE VENDAS --  ");
			System.out.println("\n1 - Cadastrar cliente");
			System.out.println("2 - Listar clientes");
			System.out.println("0 - Sair");
			System.out.println("\nDigite a op��o desejada: ");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:	
				System.out.println("\n-- CADASTRAR CLIENTE --  \n");
				
				System.out.println("Digite o nome do cliente:");	
				cliente.setNome(sc.next());	
				
				System.out.println("Digite o CPF do cliente:");	
				cliente.setCpf(sc.next());	
				
				System.out.println(cliente.getNome());
				System.out.println(cliente.getCpf());
				break;
			case 2:	
				System.out.println("\n-- LISTAR CLIENTES --  \n");			
				break;
			case 0:	
				System.out.println("\nSaindo...");			
				break;
			default:
				System.out.println("\nOp��o inv�lida!");
				break;
			}
		} while (opcao != 0);		
		sc.close();
		
	}

}