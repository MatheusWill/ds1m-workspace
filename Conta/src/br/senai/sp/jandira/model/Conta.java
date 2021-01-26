package br.senai.sp.jandira.model;

public class Conta {
	private String tipo;
	private double saldo;
	private String numero;
	private Cliente titular;
	private boolean ativa;
	private double chequeEspecial;
	
//	Métodos de acesso dos atributos da classe
//	getters and setters
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setNumero(String numero){
		this.numero = numero;
	}
	
	public String getNumero() {
		return this.numero;
	}
	
	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	public double getChequeEspecial() {
		return this.chequeEspecial;
	}
	
	public void setTipoDaConta(String tipo) {
		if (tipo.equals("Corrente") || tipo.equals("Poupança")) {
			this.tipo = tipo;
		} else {
			System.out.println("Tipo inválido!!");
		}
	}
	
	public String getTipoDaConta() {
		return this.tipo;
	}
	
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;	
	}
	
	public boolean isAtiva(boolean ativa) {
		return this.ativa;	
	}
	
	public void depositar(double valorDeposito) {
		if(valorDeposito < 0) {
			System.out.println("Valor deve ser maior que zero!");
		} else {
			saldo += valorDeposito;
		}
	}
	
	public void consultarSaldo() {
		System.out.println("Saldo : " + saldo);
		System.out.println("Saldo + Limite: " + (saldo + chequeEspecial));
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	public void sacar(double valorSaque) {
		if ((saldo + chequeEspecial) >= valorSaque) {
			saldo -= valorSaque;
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}
	
	public void transferir() {
		
	}
}