/*
 Lista de exercícios: 7 (Calculadora - Framework e Padrões de Projeto).
 Exercício: 1.
 */

package Lista7.CalculadoraExercicio1;

public class Valor implements Nodo {

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