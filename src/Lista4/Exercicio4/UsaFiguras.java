/*
 Lista de exercícios: 4.
 Exercício: 4.
 */

package Lista4.Exercicio4;

public class UsaFiguras {

	public static void main(String args[]) {
		
		// Criação e instanciamento dos objetos.
		Quadrado quadrado = new Quadrado(10);
		Circulo circulo = new Circulo(5);
		Triangulo triangulo = new Triangulo(10,10,10);
		
		// Chamada dos métodos do Quadrado.
		System.out.println("Área do quadrado: " + quadrado.calcularArea());
		System.out.println("Perímetro do quadrado: " + quadrado.calcularPerimetro());		
		
		// Chamada dos métodos do Círculo.
		System.out.println("Área do círculo: " + circulo.calcularArea());
		System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());		
		
		// Chamada dos métodos do Triângulo.
		System.out.println("Área do triângulo: " + triangulo.calcularArea());
		System.out.println("Perímetro do triângulo: " + triangulo.calcularPerimetro());
		
		
	}
	
}
