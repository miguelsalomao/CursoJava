/*
 Lista de exercícios: 3.
 Exercício: 2.
 */

/*
 * Resultado: 14. 
 * Apenas o último if mostra uma condição falsa. O teste “objeto
 * instanceof classe” testa se o objeto é instância da classe. No exemplo fica
 * comprovado que o objeto de uma classe é instância da classe a qual é
 * instanciado e de todas as classes hierarquicamente superiores a ela na
 * relação de herança.
 */

package Lista3.Exercicio2;

public class AvaliacaoInstanceOf {
    public static void main(String[] args) {
        int nota = 0;

        Forma forma1 = new Circulo();
        Forma forma2 = new Retangulo();
        Forma forma3 = new Triangulo();

        if (forma1 instanceof Forma) {
            nota += 2;            
        }
        if (forma1 instanceof Circulo) {
            nota += 2;
        }
        if (!(forma1 instanceof Retangulo)) {
            nota += 2;            
        }

        if (forma2 instanceof Forma) {
            nota += 2;
        }
        if (!(forma2 instanceof Circulo)) {
            nota += 2;
        }
        if (forma2 instanceof Retangulo) {
            nota += 2;
        }

        if (forma3 instanceof Forma) {
            nota += 2;
        }
        if (forma3 instanceof Circulo || forma3 instanceof Retangulo) {
            nota += 2;
        }

        System.out.println("Nota final: " + nota);
    }
}

class Forma {
    // Classe base Forma
}

class Circulo extends Forma {
    // Classe Circulo, que herda de Forma
}

class Retangulo extends Forma {
    // Classe Retangulo, que herda de Forma
}

class Triangulo extends Forma {
    // Classe Triangulo, que herda de Forma
}
