/*
 Lista de exercícios: 7 (Calculadora - Framework e Padrões de Projeto).
 Exercício: 3.
 */

package Lista7.CalculadoraExercicio4;

public class Exponenciacao extends Operacao {

    public Exponenciacao(Nodo esquerda, Nodo direita) {
        super(esquerda, direita);
    }

    @Override
    protected double executa(double esquerda, double direita) {
        return Math.pow(esquerda, direita);
    }

    @Override
    protected String simbolo() {
        return "^";
    }

}
