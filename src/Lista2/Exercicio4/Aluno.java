/*
 Lista de exercícios: 2.
 Exercício: 4.
 */

package Lista2.Exercicio4;

public class Aluno {
	
	String nome;
	String matricula;
	String curso;
	
	public Aluno(){
		nome = "<sem nome>";
		matricula = "<sem matrícula>";
		curso = "<nenhum curso associado>";
	}
	
	public Aluno(String nome, String matricula, String curso) {
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
	}
	
	public void informacoesAluno() {
		System.out.println("\nNome: " + nome);
		System.out.println("Matrícula: " + matricula);
		System.out.println("Curso: " + curso);
	}
	
}
