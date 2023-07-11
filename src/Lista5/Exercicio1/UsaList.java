/*
 Lista de exercícios: 5.
 Exercício: 1.
 */

package Lista5.Exercicio1;

import java.util.List;
import java.util.ArrayList;


public class UsaList {

	public static void main(String args[]) {
		
		List<Integer> listaEntrada = new ArrayList<Integer>();
		
		listaEntrada.add(10);
		listaEntrada.add(20);
		listaEntrada.add(30);
		listaEntrada.add(40);
		listaEntrada.add(50);
		listaEntrada.add(60);
		listaEntrada.add(70);
		listaEntrada.add(80);
		listaEntrada.add(90);
		listaEntrada.add(100);
		
		List<Integer> listaSaida = findDuplicates(listaEntrada);
		 
		System.out.println("Lista de saída: " + listaSaida.toString());
		
	}
	
	public static List<Integer> findDuplicates(List<Integer> numbers) {
		
		// Lista que guardará todos os elementos repetidos encontrados.
		List<Integer> repetidos = new ArrayList<Integer>();
		
		// Para cada elemento da lista "numbers". Percorre do primeiro ao penúltimo elemento da lista.
		for(int i = 0; i < (numbers.size() - 1); i++) { // 
			// Comparar com cada um dos outros elementos da lista "numbers". Percorre da posição seguinte até o final da lista.
			for(int j = (i+1); j < numbers.size(); j++) {
				
				// Se: não se trata da mesma posição na lista; os números são iguais; esse número ainda não tinha sido incluído na lista de
				// repetidos.
				if(i != j && numbers.get(i).intValue() == numbers.get(j).intValue() && !repetidos.contains(numbers.get(i))) {
					repetidos.add(numbers.get(i));
					break;
				}
				
			}
		}
		
		return repetidos;
		
	}
	
}
