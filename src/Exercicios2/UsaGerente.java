package Exercicios2;

public class UsaGerente {
	
	public static void main(String args[]) {
		
		Gerente gerente = new Gerente("João", 10000, "Informática");
		
		System.out.println("Nome: " + gerente.getNome());
		System.out.println("Salário: " + gerente.getSalario());
		System.out.println("Departamento: " + gerente.getDepartamento());
		System.out.println("Bonus salarial: " + gerente.bonusSalarial());
		
	}
	
}
