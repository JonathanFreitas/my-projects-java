package br.com.caelum.jdbc;

import java.util.List;

import br.com.caelum.classes.Contato;

public class TestLista {

	public static void main(String[] args) {
		ContatoDAO dao = new ContatoDAO();
		List<Contato> contatos = dao.getLista();
		
		for (Contato contato : contatos) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endereco: " + contato.getEndereco());
			System.out.println("Data: " + contato.getDataNascimento().getTime());
		
		
		}

	}

}
