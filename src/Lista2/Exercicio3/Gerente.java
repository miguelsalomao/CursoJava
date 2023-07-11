/*
 Lista de exercícios: 2.
 Exercício: 3.
 */

package Lista2.Exercicio3;

public class Gerente extends Funcionario{
	
	private String departamento;
	
	public Gerente(String nome, double salario, String departamento) {
		super.setNome(nome);
		super.setSalario(salario);
		this.departamento = departamento;
	}
	
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double bonusSalarial() {
		double bonus = super.getSalario() * 0.1;
		return bonus;
	}
	
}
