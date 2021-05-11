package views;
import java.util.Scanner;

public class Principal {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {		
		int opcao;
		do {			
			System.out.println("\n-- PROJETO DE FOLHAS DE PAGAMENTO --  ");
			System.out.println("\n1 - Cadastrar funcion�rio");
			System.out.println("2 - Cadastrar folha de pagamento");
			System.out.println("3 - Consultar folha de pagamento");
			System.out.println("4 - Consultar hist�rico de folhas de pagamento do m�s");
			System.out.println("0 - Sair");
			System.out.println("\nDigite a op��o desejada: ");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:	
				CadastrarFuncionario.renderizar();
				break;
			case 2:	
				CadastrarFolha.renderizar();
				break;
			case 3:	
				ConsultarFolha.renderizar();
				break;
			case 4:	
				ListarFolhas.renderizar();
				break;
			case 0:	
				System.out.println("\nSaindo...");			
				break;
			default:
				System.out.println("\nOp��o inv�lida!");
				break;
			}
		} while (opcao != 0);	
	}
}
















