/*
 Lista de exercícios: 4.
 Exercício: 4.
 */

package Exercicios4;

public class Quadrado implements Figura {
	
	double lado;
	
	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		
		return Math.pow(lado, 2);
		
	}

	@Override
	public double calcularPerimetro() {
		
		return (4 * lado);
		
	}

}
