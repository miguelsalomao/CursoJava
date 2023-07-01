/*
 Lista de exercícios: 3.
 Exercício: 5.
 */

/* RESPOSTA:
 * Tanto antes da chamada do método “modificarArray(array)” quanto depois o
 * objeto “array” não sofre modificação. Isso ocorre porque dentro do método
 * modificarArray() o endereço do objeto “array”, que foi passado para “arr”,
 * foi sobrescrito pela declaração de um novo objeto criado pela expressão “new
 * int[]{10, 20, 30, 40, 50}”. Este segundo objeto criado dentro do contexto do
 * método deixará de existir tão logo o método finalize.
 */

package Exercicios3;

public class ExercicioPassagemParametros2 {

	 public static void main(String[] args) {
	        int[] array = {1, 2, 3, 4, 5};

	        System.out.println("Antes da chamada do método: ");
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i] + " ");
	        }
	        modificarArray(array);
	        System.out.println("\nApós a chamada do método: ");
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i] + " ");
	        }
	    }

	    public static void modificarArray(int[] arr) {
	        arr = new int[]{10, 20, 30, 40, 50};
	        System.out.println("\nDentro do método: ");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	
}
