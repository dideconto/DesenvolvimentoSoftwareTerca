import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		
		int numero1, numero2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor para o primeiro n�mero: ");
		numero1 = sc.nextInt();
		
		System.out.println("Digite um valor para o segundo n�mero: ");
		numero2 = sc.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("O n�mero " + numero1 + " � maior!");
			System.out.println("O n�mero " + numero2 + " � menor!");
		}else if(numero2 > numero1) {
			System.out.println("O n�mero " + numero1 + " � menor!");
			System.out.println("O n�mero " + numero2 + " � maior!");
		}else {
			System.out.println("Os n�meros s�o iguais!");
		}

	}

}







