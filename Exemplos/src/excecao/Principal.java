package excecao;

import java.util.Scanner;

public class Principal {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		int idade = lerInteiro("\nDigite uma idade:");	
		System.out.println("Idade: " + idade);
		
		System.out.println("Fim da aplicação");
	}
	
	public static int lerInteiro(String msg) {
		boolean valorCorreto = false;
		int valor = 0;
		do {
			try {
				System.out.println(msg);
				valor = Integer.parseInt(sc.next());
				valorCorreto = true;
			} catch (NumberFormatException e) {
				System.out.println("\nDigite apenas números");
			} 
		}while(!valorCorreto);
		return valor;
	}
	
}









