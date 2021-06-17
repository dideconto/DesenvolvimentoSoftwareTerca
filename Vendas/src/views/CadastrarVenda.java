package views;

import java.util.ArrayList;
import java.util.Scanner;

import controllers.PessoaController;
import controllers.ProdutoController;
import controllers.VendaController;
import models.Cliente;
import models.ItemVenda;
import models.Produto;
import models.Venda;
import models.Vendedor;

public class CadastrarVenda {

	private static Scanner sc = new Scanner(System.in);
	private static Venda venda;
	private static String cpfCliente, cpfVendedor, nomeProduto, opcao;
	private static Cliente cliente;
	private static Vendedor vendedor;
	private static Produto produto;
	private static ItemVenda item;
	private static ArrayList<ItemVenda> itens;
	private static PessoaController controller = PessoaController.retornarInstancia();

	public static void renderizar() {
		venda = new Venda();
		itens = new ArrayList<ItemVenda>();
		System.out.println("\n".repeat(15));
		System.out.println("\n-- CADASTRAR VENDA --\n");
		//Cliente
		System.out.println("Digite o CPF do cliente:");
		cpfCliente = sc.next();
		cliente = (Cliente) controller.buscarPorCpf(cpfCliente);
		if(cliente != null) {
			venda.setCliente(cliente);
			//Vendedor
			System.out.println("Digite o CPF do vendedor:");
			cpfVendedor = sc.next();
			vendedor = (Vendedor) controller.buscarPorCpf(cpfVendedor);
			if(vendedor != null) {
				venda.setVendedor(vendedor);
				//Produtos
				do {
					System.out.println("Digite o NOME do produto:");
					nomeProduto = sc.next();
					produto = ProdutoController.buscarPorNome(nomeProduto);
					if(produto != null) {
						item = new ItemVenda();
						item.setProduto(produto);
						item.setPreco(produto.getPreco());
						System.out.println("Digite a quantidade do produto");
						item.setQuantidade(sc.nextInt());
						itens.add(item);
					}else {
						System.out.println("Produto n�o encontrado!");
					}
					System.out.println("Deseja adicionar novos produtos? (S | N)");
					opcao = sc.next();
				} while (opcao.equals("S"));
				venda.setItens(itens);
				VendaController.cadastrar(venda);
				System.out.println("Venda cadastrada com sucesso!");
			}else {
				System.out.println("Vendedor n�o encontrado!");
			}			
		}else {
			System.out.println("Cliente n�o encontrado!");
		}		
	}	
}

// PASSO A PASSO 
//1 - Pedir o CPF do cliente
//2 - (novo m�todo) Buscar o cliente pelo CPF dentro da lista que est� no controller
//3 - Verificar se o cliente existe
//4 - Colocar/Setar o objeto encontrado para dentro da venda
//5 - Repetir os passos acima para o objeto de vendedor
//6 - Criar um la�o de repeti��o para adicionar novos produtos enquanto o usu�rio precisar
//7 - Pedir o nome do produto
//8 - (novo m�todo) Buscar o produto pelo nome dentro da lista que est� no controller
//9 - Verificar se o produto existe
//10 - Preencher um objeto de ItemVenda
//11 - Adicionar o item preenchido dentro de uma lista de itens de venda
//12 - Ap�s o t�rmino da adi��o dos produtos dentro da lista, guardar a lista dentro da venda
//13 - Cadastrar a venda e mostrar uma mensagem



















