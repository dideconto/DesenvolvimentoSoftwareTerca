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
		System.out.println("\n-- CADASTRAR FUNCION�RIO --  \n");				
		System.out.println("Digite o nome do funcion�rio:");	
		funcionario.setNome(sc.next());					
		System.out.println("Digite o CPF do funcion�rio:");	
		funcionario.setCpf(sc.next());				
		System.out.println("Digite a data de nascimento do funcion�rio:");	
		funcionario.setNascimento(new Date(sc.next()));		
		if(FuncionarioController.cadastrar(funcionario)) {
			System.out.println("\nFuncion�rio cadastrado com sucesso!");
		}else {
			System.out.println("Esse funcion�rio j� existe!");
		}
	}
}









