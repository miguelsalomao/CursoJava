/*
 Lista de exercícios: 2.
 Exercício: 2.
 */

package Exercicios2;

public class Circulo extends Forma {
	
	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double calcularArea() {
		double area = Math.PI * Math.pow(raio, 2);
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro = 2 * Math.PI * raio;
		return perimetro;
	}	
	
}
