/*
 Lista de exercícios: 4.
 Exercício: 1.
 */

package Lista4.Exercicio1;

public class Moto extends Veiculo {

	@Override
	public void acelerar(int velocidade) {

		System.out.println("Acelerando a moto até " + velocidade + "km/h.");

		
	}

	@Override
	public void frear() {
		
		System.out.println("Freando a moto...");
		
	}	
	
}
