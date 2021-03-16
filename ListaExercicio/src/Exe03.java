import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		
		int numero1, numero2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor para o primeiro número: ");
		numero1 = sc.nextInt();
		
		System.out.println("Digite um valor para o segundo número: ");
		numero2 = sc.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("O número " + numero1 + " é maior!");
			System.out.println("O número " + numero2 + " é menor!");
		}else if(numero2 > numero1) {
			System.out.println("O número " + numero1 + " é menor!");
			System.out.println("O número " + numero2 + " é maior!");
		}else {
			System.out.println("Os números são iguais!");
		}

	}

}







