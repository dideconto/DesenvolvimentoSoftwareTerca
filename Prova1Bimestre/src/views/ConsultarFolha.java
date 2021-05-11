package views;

import java.util.Scanner;

import controllers.FolhaController;
import controllers.FuncionarioController;
import models.Folha;
import models.Funcionario;

public class ConsultarFolha {

	private static Scanner sc = new Scanner(System.in);
	private static String cpfFuncionario;
	private static int ano, mes;
	private static Folha folha;

	public static void renderizar() {		
		System.out.println("\n-- CONSULTAR FOLHA DE PAGAMENTO --  \n");	
		System.out.println("Digite o CPF do funcionário:");			
		cpfFuncionario = sc.next();
		System.out.println("Digite o mês da folha:");
		mes = sc.nextInt();
		System.out.println("Digite o ano da folha:");	
		ano = sc.nextInt();
		folha = FolhaController.buscarPorFuncionarioMesAno(cpfFuncionario, mes, ano);
		if(folha != null) {
			double bruto = FolhaController.calcularSalarioBruto(folha.getHoras(), folha.getValor());
			double ir = FolhaController.calcularIR(bruto);
			double inss = FolhaController.calcularINSS(bruto);
			double fgts = FolhaController.calcularFGTS(bruto);
			double liquido = FolhaController.calcularSalarioLiquido(bruto, ir, inss);
			System.out.println("Bruto: " + bruto);
			System.out.println("IR: " + ir);
			System.out.println("INSS: " + inss);
			System.out.println("FGTS: " + fgts);
			System.out.println("Líquido: " + liquido);
		}else {
			System.out.println("Folha não encontrada");	
		}

	}
}








