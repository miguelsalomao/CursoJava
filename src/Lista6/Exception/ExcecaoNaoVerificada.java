/*
	Não houve um exercício prático específico de tratamento de exceções. Criei esse para testar os conceitos.
 */

package Lista6.Exception;

public class ExcecaoNaoVerificada extends RuntimeException {

	public ExcecaoNaoVerificada(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	public static void lancaRunTimeException(int num) throws ExcecaoNaoVerificada {
				
		if (num < 0) {
			throw new ExcecaoNaoVerificada("O número não pode ser menor que zero.");
		}	
		
	}
	
}
