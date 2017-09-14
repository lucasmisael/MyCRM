package br.edu.service;

import java.util.ArrayList;

import br.edu.dao.ClienteDao;

public class ClienteService {
	
	public void  cadastrarCliente(String nome, String email, String cpf){
		ClienteDao cd = null;
		cd.cadastrarCliente(nome, email, cpf);
	}

	public ArrayList listar() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
