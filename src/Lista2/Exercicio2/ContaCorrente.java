/*
 Lista de exercícios: 2.
 Exercício: 2.
 */

package Lista2.Exercicio2;

public class ContaCorrente extends Conta{
	
	private double limiteSaque;

	public ContaCorrente(int conta, double limiteSaque) {
		
		super(conta);		
		this.limiteSaque = limiteSaque;
		
	}
	
	@Override
	public void sacar(double valor){
		if (valor <= limiteSaque) {
			super.sacar(valor);
		}else {
			System.out.println("\nO valor limite para saque foi extrapolado. Limite: " + limiteSaque);
		}
	}
	
}
