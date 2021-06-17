package controllers;

import java.util.ArrayList;

import models.Pessoa;

public class PessoaController implements IPessoaController  {
	
	//Singleton
	private static PessoaController controller;	
	public static  PessoaController retornarInstancia() {
		if(controller  == null) {
			controller = new PessoaController();
		}
		return controller;
	}

	private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

	@Override
	public boolean cadastrar(Pessoa pessoa) {
		for (Pessoa pessoaCadastrada : pessoas) {
			if(pessoaCadastrada.getCpf().equals(pessoa.getCpf())) {
				return false;
			}
		}
		pessoas.add(pessoa);
		return true;
	}

	@Override
	public Pessoa buscarPorCpf(String cpf) {
		for (Pessoa pessoaCadastrada : pessoas) {
			if(pessoaCadastrada.getCpf().equals(cpf)) {
				return pessoaCadastrada;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Pessoa> listar() {
		return pessoas;
	}

}












