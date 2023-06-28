import java.util.Scanner;

public class ExtraiDominioEmail {
	
	public static void main(String args[]) {
				
		// Declaração de objetos auxiliares. 
		Scanner sc = new Scanner(System.in);
		
		// Obtenção do endereço de email.
		System.out.println("Informe um endereço de email:");
		String email = sc.nextLine();
		sc.close();
				
		// Extração do domínio.
		int posicaoArroba = email.indexOf("@"); // Localização da posição do caracter '@' no texto.
		String dominio = email.substring(posicaoArroba + 1); // Extração do texto após o '@'.
		
		
		System.out.println("\nO domínio referente ao endereço de email informado é: \"" + dominio + "\" (sem áspas).");
		
	}
	
}
