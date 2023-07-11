/*
 Lista de exercícios: 5.
 Exercício: 5.
 */

package Lista5.Exercicio5;

import java.util.LinkedList;

public class ListaEncadeadaOrdenadaMesclada {

	public static void main(String[] args) {
		
		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		list1.add(1);
		list1.add(2);
		list1.add(4);
		list2.add(1);
		list2.add(3);
		list2.add(4);
		
		ListaEncadeadaOrdenadaMesclada listaEncadeadaOrdenadaMesclada = new ListaEncadeadaOrdenadaMesclada();
		LinkedList<Integer> listaMescladaOrdenada = listaEncadeadaOrdenadaMesclada.mergeTwoLists(list1, list2);
		
		for (Integer i : listaMescladaOrdenada) {
			System.out.println(i);
		}
	}
	
	public LinkedList<Integer> mergeTwoLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
		
		LinkedList<Integer> listaMescladaOrdenada = new LinkedList<>();
		
		while (!(list1.isEmpty() || list2.isEmpty())) {			
			if(list1.peek() < list2.peek()) {
				listaMescladaOrdenada.add(list1.pop());
			}else {
				listaMescladaOrdenada.add(list2.pop());
			}			
		}
		
		return listaMescladaOrdenada;
		
	}
	
}
