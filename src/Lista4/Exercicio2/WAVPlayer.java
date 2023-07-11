/*
 Lista de exercícios: 4.
 Exercício: 2.
 */

package Lista4.Exercicio2;

public class WAVPlayer implements FormatoAudio {

	@Override
	public void abrir(String arquivo) {

		System.out.println("Arquivo WAV \"" + arquivo + "\"  aberto.");
		
	}

	@Override
	public void reproduzir() {
		
		System.out.println("Reproduzindo arquivo WAV.");
		
	}

	@Override
	public void pausar() {
		
		System.out.println("Reprodução WAV pausada.");
		
	}

	@Override
	public void parar() {
		
		System.out.println("Reprodução WAV parada.");
		
	}

}
