/*
 Lista de exercícios: 7 (Calculadora - Framework e Padrões de Projeto).
 Exercício: 3.
 */

package Lista7.CalculadoraExercicio3;

import java.io.Serializable;

public class Valor implements Nodo, Serializable {

    private final double val;

    public Valor(double val) {
        this.val = val;
    }

    @Override
    public double calcula() {
        return this.val;
    }

    @Override
    public String toString() {
        return Double.toString(val);
    }
    
    
}