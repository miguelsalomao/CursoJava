/*
 Lista de exercícios: 7 (Calculadora - Framework e Padrões de Projeto).
 Exercício: 2.
 */

package Lista7.CalculadoraExercicio2;

public class Percentual extends Operacao {

    public Percentual(Nodo esquerda, Nodo direita) {
        super(esquerda, direita);
    }

    @Override
    protected double executa(double esquerda, double direita) {
        return (direita / esquerda);
    }

    @Override
    protected String simbolo() {
        return "%";
    }

}
