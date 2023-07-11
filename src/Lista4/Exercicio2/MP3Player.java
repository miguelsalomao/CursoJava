/*
 Lista de exercícios: 4.
 Exercício: 2.
 */

package Lista4.Exercicio2;

public class MP3Player implements FormatoAudio {

	@Override
	public void abrir(String arquivo) {
				
		System.out.println("Arquivo MP3 \"" + arquivo + "\" aberto.");
				      
	}

	@Override
	public void reproduzir() {
		
		System.out.println("Reproduzindo arquivo MP3.");
		
	}

	@Override
	public void pausar() {
		
		System.out.println("Reprodução MP3 pausada.");
		
	}

	@Override
	public void parar() {

		System.out.println("Reprodução MP3 parada.");
		
	}

}
