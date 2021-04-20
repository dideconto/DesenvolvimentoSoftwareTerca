package controllers;

import java.util.ArrayList;

import models.Cliente;

public class ClienteController {

	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>(); 

	public static ArrayList<Cliente> listar() {
		return clientes;
	}

	public static boolean cadastrar(Cliente cliente) {
		if(buscarPorCpf(cliente.getCpf()) == null) {
			clientes.add(cliente);
			return true;
		}
		return false;
	}	

	public static Cliente buscarPorCpf(String cpf) {
		for(Cliente clienteCadastrado : clientes) {
			if(clienteCadastrado.getCpf().equals(cpf)) {
				return clienteCadastrado;
			}
		}	
		return null;
	}

}













