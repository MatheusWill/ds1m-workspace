package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;

public class App {
	public static void main(String[] args) {
		
		Conta contaMatheus, contaVitoria;
		
		contaMatheus = new Conta();
		contaVitoria = new Conta();
		
//		Conta do Matheus
		//contaMatheus.setTitular ("Matheus Willian de Oliveira");
		contaMatheus.setNumero("111-3");
		contaMatheus.setTipoDaConta("Corrente");
		contaMatheus.setAtiva(true);
		contaMatheus.setChequeEspecial(200);
		contaMatheus.depositar(100);
		contaMatheus.consultarSaldo();
		contaMatheus.depositar(30);
		contaMatheus.consultarSaldo();
		contaMatheus.sacar(50);
		contaMatheus.consultarSaldo();
		contaMatheus.sacar(500);
		contaMatheus.consultarSaldo();
		contaMatheus.sacar(50);
		contaMatheus.consultarSaldo();
		contaMatheus.sacar(80);
		contaMatheus.consultarSaldo();
		contaMatheus.depositar(100);
		contaMatheus.consultarSaldo();
		contaMatheus.getSaldo();
		
		double saldoDaConta = contaMatheus.getSaldo();
		System.out.println("O saldo da conta é " + saldoDaConta);
		System.out.println("\n");
		
		//System.out.println("Nome: "+contaMatheus.getTitular());
		System.out.println("Conta: "+contaMatheus.getNumero());
		System.out.println("Tipo: "+contaMatheus.getTipoDaConta());
		System.out.println("Limite: "+contaMatheus.getChequeEspecial());

		Cliente cliente = new Cliente();
		
		
//		Conta da Vitoria
		
		
	}
}