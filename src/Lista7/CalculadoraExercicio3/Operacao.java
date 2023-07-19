/*
 Lista de exercícios: 7 (Calculadora - Framework e Padrões de Projeto).
 Exercício: 3.
 */

package Lista7.CalculadoraExercicio3;

import java.io.Serializable;

public abstract class Operacao implements Nodo, Serializable {

	private final Nodo esquerda;
    private final Nodo direita;

    public Operacao(Nodo esquerda, Nodo direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

   
    @Override
    public final double calcula() {
        return executa(this.esquerda.calcula(), this.direita.calcula());
    }
    
    protected abstract double executa(double a, double b);
    
    protected abstract String simbolo();

    @Override
    public String toString() {
        return  "(" + esquerda + " " + simbolo() + " " + direita + ")";
    }
    
    
    
}
