import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {
		
		int idade;
		String tipo;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a idade da pessoa: ");
		idade = sc.nextInt();
		
		if(idade <= 13) {
			tipo = "Criança";
		}else if(idade <= 18) {
			tipo = "Adolescente";
		}else if(idade <= 60) {
			tipo = "Adulto";
		}else {
			tipo = "Idoso";
		}
		System.out.println(tipo);
		
	}

}
