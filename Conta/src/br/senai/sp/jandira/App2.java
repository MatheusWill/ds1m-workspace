package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;

public class App2 {

	public static void main(String[] args) {
		
		// Criação do cliente
		Cliente matheus = new Cliente(); 
		matheus.setNome("Matheus Willian de Oliveira");
		matheus.setCpf("434.811.858-20");
		matheus.setTelefone("(11) 96591-6832");
		matheus.setCep("06657-760");
		
		// Criar conta do Matheus
		Conta contaMatheus = new Conta();
		contaMatheus.setTitular(matheus);
		contaMatheus.depositar(100);
		contaMatheus.setNumero("2223-4");

		System.out.println(contaMatheus.getTitular().getTelefone());
		System.out.println(contaMatheus.getTitular().getNome());
		contaMatheus.getTitular().setNome("Matheus Willian");
		System.out.println(contaMatheus.getTitular().getNome());
		
	}

}