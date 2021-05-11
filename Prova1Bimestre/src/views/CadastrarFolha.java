package views;

import java.util.Scanner;

import controllers.FolhaController;
import controllers.FuncionarioController;
import models.Folha;
import models.Funcionario;


public class CadastrarFolha {

	private static String cpfFuncionario;
	private static Scanner sc = new Scanner(System.in);
	private static Funcionario funcionario;
	private static Folha folha;
	
	public static void renderizar() {
		folha = new Folha();
		
		System.out.println("\n-- CADASTRAR FOLHA DE PAGAMENTO --  \n");	
		System.out.println("Digite o CPF do funcionário:");			
		cpfFuncionario = sc.next();
		funcionario = FuncionarioController.buscarPorCpf(cpfFuncionario);
		if(funcionario != null) {	
			folha.setFuncionario(funcionario);
			System.out.println("Digite o mês da folha:");	
			folha.setMes(sc.nextInt());
			System.out.println("Digite o ano da folha:");	
			folha.setAno(sc.nextInt());
			System.out.println("Digite a quantidade de horas da folha:");	
			folha.setHoras(sc.nextInt());
			System.out.println("Digite o valor da hora da folha:");	
			folha.setValor(sc.nextInt());			
			if(FolhaController.cadastrar(folha)) {
				System.out.println("Folha de pagamento cadastrada com sucesso!");
			}else {
				System.out.println("Essa folha de pagamento já existe");
			}			
		}else {
			System.out.println("Funcionário não cadastrado");
		}
	}
}











