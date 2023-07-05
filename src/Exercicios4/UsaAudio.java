/*
 Lista de exercícios: 4.
 Exercício: 2.
 */

package Exercicios4;

public class UsaAudio {

	public static void main(String args[]) {
	
		MP3Player mp3Player = new MP3Player();
		WAVPlayer wavPlayer = new WAVPlayer();
		
		// Realização de operações em MP3.
		mp3Player.abrir("musica.mp3");
		mp3Player.reproduzir();
		mp3Player.pausar();
		mp3Player.parar();
		
		// Realização de operações em WAV.
		wavPlayer.abrir("musica.wav");
		wavPlayer.reproduzir();		
		wavPlayer.pausar();
		wavPlayer.parar();
		
	}
	
}
