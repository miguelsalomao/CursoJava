package Exercicios2;

public class CadastroAlunos {

	public static void main (String args[]) {
		
		// Criação dos objetos da classe Aluno pelo primeiro e pelo segundo método construtor.
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno("Miguel", "2001047754", "Java");
		
		System.out.println("\nAluno 1: ");
		System.out.println("Nome: " + aluno1.nome);
		System.out.println("Matrícula: " + aluno1.matricula);
		System.out.println("Curso: " + aluno1.curso);
		System.out.println("\nAluno 2: ");
		System.out.println("Nome: " + aluno2.nome);
		System.out.println("Matrícula: " + aluno2.matricula);
		System.out.println("Curso: " + aluno2.curso);
		
	}
	
}
