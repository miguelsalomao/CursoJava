/*
 Lista de exercícios: 4.
 Exercício: 5.
 */

package Lista4.Exercicio5;

public class PagamentoCartao implements ProcessadorPagamento {

	@Override
	public void processarPagamento(double valor) {

		System.out.println("Pagamento realizado via cartão no valor de \"" + valor + "\".");
		
	}

}
