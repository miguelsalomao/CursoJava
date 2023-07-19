/*
 Lista de exercícios: 6.
 Exercício: Generics.
 */

package Lista6.Generics;

public class Pilha<T> {
    private T[] elementos;
    private int topo;

    //Construtor que recebe o tamanho do array elementos como parâmetro.
	@SuppressWarnings("unchecked") // Para suprimir a mensagem de warning "Type safety: Unchecked cast from
									// Object[] to T[]" durante o instanciamento e cast de "elemento". Esse warning
									// significa que o compilador nao pode garantir a segurança na tipagem. Trata-se
									// de um downcast onde o compilador nao faz ideia do tipo de objeto que esta sento atribuido. 
    																																																	
    public Pilha(int capacidade) {
		// elementos = new T[tamanho]; //Isso não funciona provavelmente para que se
    								   // mantenha compatibilidade com códigos antigos antes da inovação do Generics.    	
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