/*
 Lista de exercícios: 4.
 Exercício: 1.
 */

package Lista4.Exercicio1;

public class Carro extends Veiculo {

	@Override
	public void acelerar(int velocidade) {
		
		System.out.println("Acelerando o carro até " + velocidade + "km/h.");
		
	}

	@Override
	public void frear() {
		
		System.out.println("Freando o carro...");
		
	}

}
