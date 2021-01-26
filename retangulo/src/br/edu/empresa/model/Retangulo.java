package br.edu.empresa.model;

public class Retangulo {
	
	private double base;
	private double altura;
//	Metodos de acesso
	public void setBase(double base) {
		this.base = base;
	}
	public double getBase() {
		return this.base;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getAltura() {
		return altura;
	}
//	Metodos para calculo de area e perimetro
	public double calcularArea() {
		return this.base * this.altura;
	}
	public double calcularPerimetro() {
		return 2*(this.base + this.altura);
	}
}