/*
	Não houve um exercício prático específico de tratamento de exceções. Criei esse para testar os conceitos.
 */

package Lista6.Exception;

public class ExcecaoVerificada extends Exception {
	
	/***
	 * explicação do treco
	 * @param mensagem
	 */
	public ExcecaoVerificada(String mensagem) {
		super(mensagem);
		// TODO Auto-generated constructor stub
	}
	
	public static void lancaExceptionSeMenorZero(int num) throws ExcecaoVerificada  {		
		
		if (num < 0) {
			throw new ExcecaoVerificada("O número não pode ser menor que zero.");
		}		
		
	}
	
}
