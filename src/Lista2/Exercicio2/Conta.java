/*
 Lista de exercícios: 2.
 Exercício: 2.
 */

package Lista2.Exercicio2;

public class Conta {
  
	private int conta;	
	private double saldo = 0.00;
	
	public Conta(int conta) {
		this.conta = conta;
	}
	
	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void sacar(double valor){
		if (saldo >= valor) {
			saldo -= valor;
		}
		else {
			System.out.println("\nSaldo insuficiente!");
		}
	}
	
}
