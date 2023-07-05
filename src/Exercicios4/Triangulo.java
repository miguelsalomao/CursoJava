/*
 Lista de exercícios: 4.
 Exercício: 4.
 */

package Exercicios4;

public class Triangulo implements Figura {
		
	double base;
	double ladoEsquerdo;
	double ladoDireito;
	
	public Triangulo(double base, double ladoEsquerdo, double ladoDireito) {
		super();
		this.base = base;
		this.ladoEsquerdo = ladoEsquerdo;
		this.ladoDireito = ladoDireito;
	}

	@Override
	public double calcularArea() {		
		
		double semiPerimetro = ((base + ladoEsquerdo + ladoDireito) / 2);
		
		// Fórmula de Heron para calcular a área de um triângulo a partir de seus lados.
		// Área = √(s(s - a)(s - b)(s - c))
		
		//return ((base * altura) / 2);
		return Math.sqrt((semiPerimetro * (semiPerimetro - base) * (semiPerimetro - ladoEsquerdo) * (semiPerimetro - ladoDireito)));
		
	}

	@Override
	public double calcularPerimetro() {

		return (base + ladoEsquerdo + ladoDireito);		
		
	}

}
