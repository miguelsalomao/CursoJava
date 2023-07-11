/*
 Lista de exercícios: 3.
 Exercício: 3.
 */

package Lista3.Exercicio3;

/* RESPOSTA
 * Esse código não compila, pois há um erro. Na classe Retangulo há
 * uma tentativa de sobrescrita do método exibirInformacoes() da classe pai,
 * entretanto esse método está definido como “final”, neste caso, não permite
 * sobrescrita. Uma forma de corrigir o erro é remover o “final” do método
 * exibirInformacoes() da classe Forma. O termo “final” no Java define uma
 * constante para variáveis e tem um comportamento semelhante para métodos, onde
 * uma vez definido não pode ser alterado.
 */

/*
package Exercicios3;

public class ExercicioMetodoFinal {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5, 10);
        retangulo.exibirInformacoes();
        retangulo.calcularArea();
    }
}

class Forma {
    public final void exibirInformacoes() {
        System.out.println("Esta é uma forma geométrica.");
    }
}

class Retangulo extends Forma {
    private int largura;
    private int altura;

    public Retangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

 
    public void exibirInformacoes() {
        System.out.println("Este é um retângulo com largura " + largura + " e altura " + altura + ".");
    }

    public void calcularArea() {
        int area = largura * altura;
        System.out.println("A área do retângulo é: " + area);
    }
}
*/

