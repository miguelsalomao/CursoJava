package Lista7.CalculadoraExercicio2;

import java.util.Scanner;

public class Calculadora {

	/***
	 * Executa a calculadora. Exibe o menu e chama as operações.
	 * @param args
	 */
	public static void main(String args[]) { 
        
		// Declarações de variáveis.		
		int opcao = -1;
		double num1; // Primeiro valor (esquerda).
		double num2; // Segundo valor (direita).
		Nodo resultado = new Valor(0); // O resultado é do tipo Nodo e começa guardando um Valor contendo "0".
		Scanner input = new Scanner(System.in);
		
		while (opcao != 0) {
		
			// Exibição do menu.
			System.out.println("- Escolha uma opção -");
			System.out.println("1. Soma");
			System.out.println("2. Subtração");
			System.out.println("3. Multiplicação");
			System.out.println("4. Divisão");
			System.out.println("5. Exponenciação");
			System.out.println("6. Percentual");
			System.out.println("0. Sair");
			System.out.println("Operação: ");
		
			opcao = input.nextInt(); // Recebimento da opção.
			
			if(opcao == 0) {
				System.out.println("\nFim da execução da calculadora.");
				break; 
			}
			
			System.out.println("Qual o primeiro numero: "); 
			num1 = input.nextDouble();  // Captura o primeiro número (esquerda).
			Nodo esquerda = new Valor(num1); // O número é armazenado num objeto do tipo Nodo.
			System.out.println("Qual o segundo numero: ");
			num2 = input.nextInt(); // Captura o segundo número (direita).
			Nodo direita = new Valor(num2); // O número é armazenado num objeto do tipo Nodo.
			if (opcao == 1) { // Soma.
				resultado = new Soma(esquerda, direita); // "resultado", que é do tipo Nodo, recebe um objeto de "Soma",
														 // que também herda de "Nodo".
				System.out.print("\nO resultado da soma é: ");
			} else if (opcao == 2) { // Subtração.
				resultado = new Subtracao(esquerda, direita); // "resultado", que é do tipo Nodo, recebe um objeto de "Subtracao",
															  // que também herda de "Nodo".
				System.out.print("\nO resultado da subtração é: ");
			} else if (opcao == 3) { // Multiplicação.
				resultado = new Multiplicacao(esquerda, direita); // "resultado", que é do tipo Nodo, recebe um objeto de "Multiplicacao",
																  // que também herda de "Nodo".
				System.out.print("\nO resultado da multiplicação é: " );
			} else if (opcao == 4) { // Divisão.
				resultado = new Divisao(esquerda, direita); // "resultado", que é do tipo Nodo, recebe um objeto de "Divisao",
															// que também herda de "Nodo".
				System.out.printf("\nO resultado da divisão é:");
			} else if (opcao == 5) { // Exponenciação.
				resultado = new Exponenciacao(esquerda, direita); // "resultado", que é do tipo Nodo, recebe um objeto de "Divisao",
															// que também herda de "Nodo".
				System.out.printf("\nO resultado da divisão é:");
			} else if (opcao == 6) { // Percentual.
				resultado = new Percentual(esquerda, direita); // "resultado", que é do tipo Nodo, recebe um objeto de "Divisao",
															// que também herda de "Nodo".
				System.out.printf("\nO resultado da divisão é:");
			} else {
				System.out.println("A opção selecionada é inválida.");
			}
		
			System.out.println(resultado.calcula() + "\n");
			
		} // fim do while.
		
		input.close();		
		
	} // Fim do Main().
} // Fim da classe.