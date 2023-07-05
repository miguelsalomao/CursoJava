/*
 Lista de exercícios: 4.
 Exercício: 5.
 */

package Exercicios4;

public class UsaPagamentos {

	public static void main(String args[]) {
	
		PagamentoBoleto pagamentoBoleto = new PagamentoBoleto();
		PagamentoCartao pagamentoCartao = new PagamentoCartao();
		
		pagamentoBoleto.processarPagamento(70);
		pagamentoCartao.processarPagamento(75);
				
	}
	
}
