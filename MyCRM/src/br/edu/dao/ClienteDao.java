package br.edu.dao;

import br.edu.model.Cliente;

public class ClienteDao {
	public void cadastrarCliente(String nome, String email, String cpf){
		Cliente c = null;
		
		c.setNome(nome);
		c.setEmail(email);
		c.setCpf(cpf);
	}

}
