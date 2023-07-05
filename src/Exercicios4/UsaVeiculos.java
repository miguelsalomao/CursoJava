/*
 Lista de exercícios: 4.
 Exercício: 1.
 */

package Exercicios4;

public class UsaVeiculos {

	public static void main(String args []) {
		
		Carro carro = new Carro();
		Moto moto = new Moto();
		
		// Acelerar o carro.
		carro.acelerar(100);
		// Frear o carro.
		carro.frear();
		
		// Acelerar a moto.
		moto.acelerar(100);
		// Frear a moto.
		moto.frear();
		
	}
	
}
