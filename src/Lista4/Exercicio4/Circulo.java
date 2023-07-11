/*
 Lista de exercícios: 4.
 Exercício: 4.
 */

package Lista4.Exercicio4;

public class Circulo implements Figura {

	double raio;
		
	
	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	@Override
	public double calcularArea() {

		return (Math.PI * Math.pow(raio, 2) );
		
	}

	@Override
	public double calcularPerimetro() {

		return (2 * Math.PI * raio);
		
	}

}
