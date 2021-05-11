package views;

import java.util.Scanner;

import controllers.FolhaController;
import controllers.FuncionarioController;
import models.Folha;
import models.Funcionario;

public class ListarFolhas {

	private static Scanner sc = new Scanner(System.in);
	private static int ano, mes;
	private static Folha folha;
	private static double total;

	public static void renderizar() {		
		System.out.println("\n-- CONSULTAR FOLHAS DE PAGAMENTO --  \n");
		System.out.println("Digite o mês da folha:");
		mes = sc.nextInt();
		System.out.println("Digite o ano da folha:");	
		ano = sc.nextInt();
		for(Folha folhaCadastrada : FolhaController.buscarPorMesAno(mes, ano)) {
			double bruto = FolhaController.calcularSalarioBruto(folhaCadastrada.getHoras(), folhaCadastrada.getValor());
			double ir = FolhaController.calcularIR(bruto);
			double inss = FolhaController.calcularINSS(bruto);
			double fgts = FolhaController.calcularFGTS(bruto);
			double liquido = FolhaController.calcularSalarioLiquido(bruto, ir, inss);
			System.out.println("\nFuncionário: " + folhaCadastrada.getFuncionario().getNome());
			System.out.println("Bruto: " + bruto);
			System.out.println("IR: " + ir);
			System.out.println("INSS: " + inss);
			System.out.println("FGTS: " + fgts);
			System.out.println("Líquido: " + liquido);
			total += liquido;
		}
		System.out.println("\nTotal: " + total);
	}
}








