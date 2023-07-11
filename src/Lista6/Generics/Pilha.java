/*
 Lista de exercícios: 6.
 Exercício: Generics.
 */

package Lista6.Generics;

public class Pilha<T> {
    private T[] elementos;
    private int topo;

    //Construtor que recebe o tamanho do array elementos como parâmetro.
    public Pilha(int capacidade) {
    	elementos = (T[]) new Object[capacidade];
    	topo = -1;
    }

	//recebe um elemento e adiciona na pilha, se a pilha atingiu a capacidade máxima, ou seja o array está completo, lance uma exceção: throw new IllegalStateException("A pilha está cheia.");  
    public void push(T elemento) {
    	
    	if (isFull()) {
    		throw new IllegalStateException("A pilha está cheia.");
    	}
    	
    	elementos[topo + 1] = elemento;
    	topo = topo + 1;
    	    	
    }
    
	// retira um elemento do topo da pilha, se a pilha estiver vazia lance uma exceção: throw new IllegalStateException("A pilha está vazia.");
    public T pop() {    	
    	
    	if(isEmpty()) {
    		throw new IllegalStateException("A pilha está vazia.");
    	}
    	
    	T elementoAuxiliar = elementos[topo];
    	elementos[topo] = null;
    	topo = topo - 1;    	
    	
    	return elementoAuxiliar;
    	
    }

	//retorna o elemento do topo sem remover do array, se a pilha estiver vazia lance uma exceção: throw new IllegalStateException("A pilha está vazia."); 
    public T peek() {
    	if(isEmpty()) {    		
    		throw new IllegalStateException("A pilha está vazia.");
    	}
    	return elementos[topo];
    }
    
	// método que checa se a pilha está vazia
    public boolean isEmpty() {
    	return (topo == (-1));
    }
    
	//método que checa se a pilha está cheia
    public boolean isFull() {
        return (topo == (elementos.length -1));
    }
    
	//retorna quantos elementos estão na pilha, não é o tamanho do array 
    public int size() {
    	return (topo + 1);
    }
}