/*
 Lista de exercícios: 2.
 Exercício: 2.
 */

package Lista2.Exercicio2;

public class UsaContaCorrente {

	public static void main(String args[]) {
		
		ContaCorrente contaCorrente = new ContaCorrente(1, 100);
		
		contaCorrente.depositar(150);
		
		contaCorrente.sacar(120);
		contaCorrente.sacar(100);
		contaCorrente.sacar(100);
		
	}
	
}
