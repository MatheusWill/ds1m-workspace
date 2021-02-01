package oliveira.willian.matheus.model;

public class Calculadora {
	
	private double resultado;
	
	public double getResultado() {
		return this.resultado;
	}

	public void somar(double x, double y) {
		this.resultado = x + y;
	}
	public void subtrair(double x, double y) {
		this.resultado =  x - y;
	}
	public void dividir(double x, double y) {
		this.resultado =  x / y;
	}
	public void multiplicar(double x, double y) {
		this.resultado =  x * y;
	}
}
