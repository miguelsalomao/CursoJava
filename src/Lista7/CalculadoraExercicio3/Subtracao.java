/*
 Lista de exercícios: 7 (Calculadora - Framework e Padrões de Projeto).
 Exercício: 3.
 */

package Lista7.CalculadoraExercicio3;

public class Subtracao extends Operacao {

    public Subtracao(Nodo esquerda, Nodo direita) {
        super(esquerda, direita);
    }

    @Override
    protected double executa(double esquerda, double direita) {
        return esquerda - direita;
    }

    @Override
    protected String simbolo() {
        return "-";
    }

}