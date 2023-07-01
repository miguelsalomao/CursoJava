/*
 Lista de exercícios: 3.
 Exercício: 1.
 */

package Exercicios3;

public class UsaVeiculos {
	
	public static void main(String args[]) {
		
		Moto moto = new Moto();
		Carro carro = new Carro();
		
		System.out.println("\nAcelerando a moto...");
		moto.acelerar();		
		System.out.println("\nAcelerando o carro...");		
		carro.acelerar();		
		
	}
	
}
