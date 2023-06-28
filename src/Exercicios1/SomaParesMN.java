package Exercicios1;

import java.util.Scanner;

public class SomaParesMN {
	
	public static void main(String args[]) {
		
		// Recebimento dos valores de entrada.
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o número inicial:");
		int numInicial = sc.nextInt();
		System.out.println("Informe o número final:");
		int numFinal = sc.nextInt();
		sc.close();
				
		// Iniciação das variáveis auxiliares.
		int soma = 0;
		
		// Cálculo da soma dos pares.
		for (int contador = numInicial; contador <= numFinal; contador++) {
			if (contador % 2 == 0) {
				soma += contador;
			}		
		}
		
		System.out.printf("\nResultado da soma dos números pares de %d a %d é %d.", numInicial, numFinal, soma);
  
	}
	
}
