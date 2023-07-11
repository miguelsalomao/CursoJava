/*
 Lista de exercícios: 4.
 Exercício: 5.
 */

package Lista4.Exercicio5;

public class PagamentoBoleto implements ProcessadorPagamento {

	@Override
	public void processarPagamento(double valor) {

		System.out.println("Pagamento realizado via boleto no valor de \"" + valor + "\".");
		
	}

}
