import java.util.Scanner;

public class Exe05 {

	public static void main(String[] args) {
		
		int limite, anterior = 0, atual = 1, proximo = anterior + atual;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o limite da sequência fibonacci: ");
		limite = sc.nextInt();
		
		System.out.print(anterior + " ");
		System.out.print(atual + " ");
		
		do {
			System.out.print(proximo + " ");
			proximo = anterior + atual;
			anterior = atual;
			atual = proximo;
		} while (proximo < limite);
	}

}
