/*
 Lista de exercícios: 7 (Calculadora - Framework e Padrões de Projeto).
 Exercício: 4.
 */

package Lista7.CalculadoraExercicio4;

import java.io.Serializable;

public class Soma extends Operacao {

    public Soma(Nodo esquerda, Nodo direita) {
        super(esquerda, direita);
    }

    @Override
    protected double executa(double esquerda, double direita) {
        return esquerda + direita;
    }

    @Override
    protected String simbolo() {
        return "+";
    }

}

