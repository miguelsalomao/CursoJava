/*
 Lista de exercícios: 7 (Calculadora - Framework e Padrões de Projeto).
 Exercício: 3.
 */

package Lista7.CalculadoraExercicio3;

import java.util.List;

public interface Armazenamento {

	public abstract void salvarExpressao(String id, String expressao);

	public abstract void salvarOperacao(String id, Nodo operacao);

	public abstract void salvarResultado(String id, double resultado);

	public abstract String recuperarExpressao(String id);

	public abstract Operacao recuperarOperacao(String id);

	public abstract double recuperarResultado(String id);

	public abstract List<String> listarExpressoes();
	
}
