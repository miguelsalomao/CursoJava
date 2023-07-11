/*
 Lista de exercícios: 5.
 Exercício: 2.
 */

package Lista5.Exercicio2;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


public class ListEMap {

	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<String>();
		
		palavras.add("alicate");
		palavras.add("cadeira");
		palavras.add("alicate");
		palavras.add("parede");
		palavras.add("alicate");
		palavras.add("comida");
		palavras.add("água");
		palavras.add("cabelo");
		palavras.add("pista");
		palavras.add("pista");
	
		HashMap<String, Integer> palavraQuantidade = (HashMap<String, Integer>)countOccurrences(palavras);
		
		System.out.println(palavraQuantidade.toString());
		
	}	
	
	public static Map<String, Integer> countOccurrences(List<String> strings) {

		HashMap<String, Integer> palavraQuantidade = new HashMap<>();
		
		Integer valor;
		
		for (String elemento : strings) {
			
			if(palavraQuantidade.containsKey(elemento.toString())) {
				valor = palavraQuantidade.get(elemento.toString());
				palavraQuantidade.put(elemento.toString(), (valor + 1));
			}else {
				palavraQuantidade.put(elemento.toString(), 1);
			}
			
		}

		return palavraQuantidade;
		
	}
	
}
