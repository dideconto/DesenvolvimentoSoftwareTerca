package views;

import java.util.ArrayList;
import java.util.Scanner;

import controllers.ClienteController;
import controllers.ProdutoController;
import controllers.VendaController;
import controllers.VendedorController;
import models.Cliente;
import models.ItemVenda;
import models.Produto;
import models.Venda;
import models.Vendedor;

public class CadastrarVenda {
	
	private static Venda venda;	
	private static Cliente cliente;
	private static Vendedor vendedor;
	private static Produto produto;
	private static ItemVenda itemVenda;
	private static ArrayList<ItemVenda> itens;
	private static String cpfCliente, cpfVendedor, nomeProduto, opcao;
	private static Scanner sc = new Scanner(System.in);
	
	public static void renderizar() {	
		venda = new Venda();
		cliente = new Cliente();
		vendedor = new Vendedor();
		itens = new ArrayList<ItemVenda>();
		
		System.out.println("\n".repeat(20));
		System.out.println("\n-- CADASTRAR VENDA --  \n");		
		//Cliente
		System.out.println("Digite o CPF do cliente:");			
		cpfCliente = sc.next();
		cliente = ClienteController.buscarPorCpf(cpfCliente);
		if(cliente != null) {			
			venda.setCliente(cliente);			
			//Vendedor
			System.out.println("Digite o CPF do vendedor:");			
			cpfVendedor = sc.next();
			vendedor = VendedorController.buscarPorCpf(cpfVendedor);
			if(vendedor != null) {			
				venda.setVendedor(vendedor);
				//Produtos - Itens de Venda
				do {
					System.out.println("Digite o nome do produto:");
					nomeProduto = sc.next();
					produto = ProdutoController.buscarPorNome(nomeProduto);
					if(produto != null) {
						itemVenda = new ItemVenda();
						itemVenda.setProduto(produto);
						itemVenda.setPreco(produto.getValor());
						System.out.println("Digite a quantidade do produto:");	
						itemVenda.setQuantidade(sc.nextInt());
						itens.add(itemVenda);
						System.out.println("\nProduto que adicionado com sucesso!");	
					}else {
						System.out.println("Esse produto não existe!");	
					}					
					System.out.println("\nDeseja adicionar mais produtos?");
					opcao = sc.next(); 
				}while(opcao.toUpperCase().equals("S"));
				venda.setItensVenda(itens);
				VendaController.cadastrar(venda);
				System.out.println("\nVenda cadastrada com sucesso!");
				
			}else {	
				System.out.println("Esse vendedor não existe!");		
			}
		}else {	
			System.out.println("Esse cliente não existe!");		
		}		
	}
}





































