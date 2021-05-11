package views;

import java.util.Date;
import java.util.Scanner;

import controllers.FuncionarioController;
import models.Funcionario;

public class CadastrarFuncionario {
	
	private static Funcionario funcionario;	
	private static Scanner sc = new Scanner(System.in);
	
	public static void renderizar() {
		funcionario = new Funcionario();
		System.out.println("\n".repeat(20));
		System.out.println("\n-- CADASTRAR FUNCIONÁRIO --  \n");				
		System.out.println("Digite o nome do funcionário:");	
		funcionario.setNome(sc.next());					
		System.out.println("Digite o CPF do funcionário:");	
		funcionario.setCpf(sc.next());				
		System.out.println("Digite a data de nascimento do funcionário:");	
		funcionario.setNascimento(new Date(sc.next()));		
		if(FuncionarioController.cadastrar(funcionario)) {
			System.out.println("\nFuncionário cadastrado com sucesso!");
		}else {
			System.out.println("Esse funcionário já existe!");
		}
	}
}









