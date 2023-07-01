/*
 Lista de exercícios: 3.
 Exercício: 4.
 */

/* RESPOSTA:
 * Tanto antes da chamada do método “alterarValores()” quanto depois as
 * variáveis “a” e “b” não sofrem modificação. Isso ocorre porque ao passar
 * essas variáveis da forma “alterarValores(a, b)”, dentro do contexto desse
 * método, existe apenas uma cópia dos valores dessas variáveis. As variáveis
 * “x” e “y”, declaradas dentro do contexto do método deixarão de existir tão
 * logo o método finalize.
 */

package Exercicios3;

public class ExercicioPassagemParametros {
	
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Antes da chamada do método: a = " + a + ", b = " + b);
        alterarValores(a, b);
        System.out.println("Após a chamada do método: a = " + a + ", b = " + b);
    }

    public static void alterarValores(int x, int y) {
        x += 5;
        y *= 2;
        System.out.println("Dentro do método: x = " + x + ", y = " + y);
    }

}
