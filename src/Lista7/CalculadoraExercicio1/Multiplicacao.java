/*
 Lista de exercícios: 7 (Calculadora - Framework e Padrões de Projeto).
 Exercício: 1.
 */

package Lista7.CalculadoraExercicio1;

public class Multiplicacao extends Operacao {

    public Multiplicacao(Nodo esquerda, Nodo direita) {
        super(esquerda, direita);
    }

    @Override
    protected double executa(double esquerda, double direita) {
        return esquerda * direita;
    }

    @Override
    protected String simbolo() {
        return "*";
    }

}