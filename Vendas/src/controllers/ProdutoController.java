package controllers;

import java.util.ArrayList;

import models.Produto;

public class ProdutoController {

	private static ArrayList<Produto> produtos = new ArrayList<Produto>(); 

	public static ArrayList<Produto> listar() {
		return produtos;
	}

	public static boolean cadastrar(Produto produto) {
		if(buscarPorNome(produto.getNome()) == null) {
			produtos.add(produto);
			return true;
		}
		return false;
	}	
	
	public static Produto buscarPorNome(String nome) {
		for(Produto produtoCadastrado : produtos) {
			if(produtoCadastrado.getNome().equals(nome)) {
				return produtoCadastrado;
			}
		}	
		return null;
	}
}













