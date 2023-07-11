/*
 Lista de exercícios: 4.
 Exercício: 3.
 */

package Lista4.Exercicio3;

public class Main {

	public static void main(String args[]) {
		
		Aluno[] alunos = {new Aluno("João", 10), new Aluno("Fernanda", 12), new Aluno("José", 14), new Aluno("Amanda", 13), new Aluno("Epaminondas", 15), 
				new Aluno("Caio", 10), new Aluno("Maximiano", 15), new Aluno("Eliseu", 11), new Aluno("Joaquim", 11), new Aluno("Francisco", 10)};
	
		Main main = new Main();
		
		Aluno alunoMaisVelho = main.maxIdade(alunos);
		
		Aluno alunoMaisNovo = main.minIdade(alunos);
		
		System.out.println("A idade mais velha entre os alunos é de " + alunoMaisVelho.getIdade() + " anos.");
		System.out.println("A idade mais nova entre os alunos é de " + alunoMaisNovo.getIdade() + " anos."); 

		
	}
	
	public Aluno maxIdade(Aluno[] alunos){
		
		int maisVelho = 0;
		
		for (int i = 1; i < alunos.length; i++) {
			
			if(alunos[maisVelho].comparar(alunos[i])) { // O outro aluno é mais velho que o atual?
				maisVelho = i;
			}
			
		}
		
		return alunos[maisVelho];
		
	}
	
	public Aluno minIdade(Aluno[] alunos){
		
		Aluno alunoMaisNovo = alunos[0];
		
		for (int i = 1; i < alunos.length; i++) {
			
			if(!alunoMaisNovo.comparar(alunos[i])) { // O outro aluno é mais novo que o atual?
				alunoMaisNovo = alunos[i];
			}
			
		}
		
		return alunoMaisNovo;
	}
	
}
