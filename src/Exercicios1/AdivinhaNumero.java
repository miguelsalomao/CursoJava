package Exercicios1;

import java.util.Scanner;
import java.util.Random;

public class AdivinhaNumero {
	
	public static void main(String args[]) {
		
		// Declaração de variáveis auxiliares.
		int tentativa = -1;
		int contTentativa = 0;
		
		// Declaração de objetos auxiliares. 
		Scanner sc = new Scanner(System.in);
				
		// Geração do número aleatório de 1 a 100.
		Random gerador = new Random();		
		int numAleatorio = gerador.nextInt(100);
		numAleatorio++;
				
		System.out.println("Tente acertar o número aleatório de 1 a 100:");		
		// Enquanto não descobrir o número.
		while (tentativa != numAleatorio) {
			
			contTentativa++;
			
			// Pega o número da tentativa.
			tentativa = sc.nextInt();		
			
			// Se acertou
			if (tentativa == numAleatorio) {
				
				System.out.println("\n\nACERTÔ, MIZERAVI!");
				System.out.printf("\nVocê conseguiu usando %d tentativas.", contTentativa);
			
			} else{ // Se errou.
				
				System.out.println("Você ainda não acertou.");
				
				if (tentativa > numAleatorio) { // Dica no caso da tentativa ter sido alta.
					System.out.println("Dica: tente um número menor.");
				}else { // Dica no caso da tentativa ter sido baixa.
					System.out.println("Dica: tente um número maior.");
				}
				
			}
				
		}
		
		sc.close();
		
	}
	
}
