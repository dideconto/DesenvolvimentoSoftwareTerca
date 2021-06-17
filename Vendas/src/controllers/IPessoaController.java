package controllers;

import java.util.ArrayList;

import models.Pessoa;

public interface IPessoaController {
	
	public boolean cadastrar(Pessoa cliente);
	public Pessoa buscarPorCpf(String cpf);
	public ArrayList<Pessoa> listar();
	
}
