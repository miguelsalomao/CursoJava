/*
 Lista de exercícios: 4.
 Exercício: 3.
 */

package Exercicios4;

public class Aluno extends ObjetoComparavel {

	public String nome;
	public int idade;
	
	// Retorna verdadeiro se o aluno passado como parâmetro for mais velho.
	@Override public boolean comparar(Comparavel outro) {
		
		Aluno outroAluno = (Aluno)outro;		
		
		if(outroAluno.getIdade() > this.getIdade()) {
			return true;
		}else {
			return false;
		}
		
	}	

	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
