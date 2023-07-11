/*
 Lista de exercícios: 2.
 Exercício: 1.
 */

package Lista2.Exercicio1;

import java.util.Scanner;

public class UsaCirculo {
	public static void main (String args[]) {

		// Obtem do usuário um valor de raio.
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o raio da circunferência:");
		Double raio = sc.nextDouble();
		sc.close();
		
		// Instancia um objeto da classe Circulo com o valor de raio obtido do usuário.
		Circulo circulo = new Circulo(raio);
		
		System.out.println("Área do círculo:" + circulo.calcularArea());
		System.out.println("Perímetro do círculo:" + circulo.calcularPerimetro());
	}
	
}