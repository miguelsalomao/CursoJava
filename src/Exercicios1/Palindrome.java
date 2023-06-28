package Exercicios1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String args[]) {
		
		// Declaração de objetos auxiliares. 
		Scanner sc = new Scanner(System.in);
		
		// Obtenção do texto.
		System.out.println("Informe o texto:");
		String texto = sc.nextLine();
		sc.close();
		
		// Formatação do texto antes da inversão.
		texto = texto.replace(" ", ""); // Remoção de caracteres em branco (espaços).
		texto = texto.toLowerCase(); // Formatação de todas as letras para minúscula.
		
		int nCaracteresTexto = texto.length(); // Obtenção do comprimento da string. 
		int ponteiro = (nCaracteresTexto - 1); // Criação de um ponteiro para apontar um a um dos caracteres.
		String textoInvertido = ""; // Criação da variável "textoInvertido" vazia.
		
		// Inversão dos caracteres. Preenchimento da variável "textoInvertido".
		while (ponteiro >= 0) { 
			textoInvertido += texto.charAt(ponteiro);			
			ponteiro--;
		}		
		
		/* ### MODO ALTERNATIVO USANDO CLASSE PRONTA DO JAVA ###
		// Inverte os caracteres do texto.
		String textoInvertido = new StringBuilder(texto).reverse().toString();
		*/
		
		//Apresenta na tela os textos antes e após a inversão.
		System.out.println("Texto informado:" + texto);
		System.out.println("Texto invertido:" + textoInvertido);
		
		//Testa e informa se é ou não um palíndrome:
		System.out.println(); 
		if (texto.equals(textoInvertido)){
				System.out.println("O texto informado se configura como um palindrome.");
		}else {
				System.out.println("O texto informado não se configura como um palindrome.");
		}
				
	}
	
}
