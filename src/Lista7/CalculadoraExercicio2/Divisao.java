package Lista7.CalculadoraExercicio2;

public class Divisao extends Operacao {

    public Divisao(Nodo esquerda, Nodo direita) {
        super(esquerda, direita);
    }

    @Override
    protected double executa(double esquerda, double direita) {
        return esquerda / direita;
    }

    @Override
    protected String simbolo() {
        return "/";
    }

}