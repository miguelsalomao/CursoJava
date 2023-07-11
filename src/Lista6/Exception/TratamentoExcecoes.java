/*
	Não houve um exercício prático específico de tratamento de exceções. Criei esse para testar os conceitos.
 */

package Lista6.Exception;

public class TratamentoExcecoes {
	public static void main(String[] args) {
		
		// Declaração de um array para gerar erros de array.
		int numeros[] = {10,20,30,40,50,60,70,80,90,100};	
		
		try { // Tentativa de acessar um índica ilegal no array.
		
			acessaIndiceIlegal(numeros);
			System.out.println("Não gerou exceção."); // Se executar essa linha é porque não foi gerada exceção.			
		
		}
		
		catch(ArrayIndexOutOfBoundsException e){
		 
			System.out.println("Entrou no \"catch\" de ArrayIndexOutOfBoundsException.");
			System.out.println(e.getMessage()); 
		}
		
		catch(IllegalStateException e){
			 
			System.out.println("Entrou no \"catch\" de IllegalStateException.");
			System.out.println(e.getMessage()); 
		}
		
		catch(Exception e) {
			System.out.println("Entrou no \"catch\" de Exception.");
			System.out.println(e.getMessage());
		}
		 
		finally{		 
			System.out.println("Linha de código do \"finally\".");		 
		}		
		
	}
	
	// Método passível de gerar exceção.
	public static void acessaIndiceIlegal(int num[]) throws Exception {
		
		// Gera uma exceção do tipo ArrayIndexOutOfBoundsException.
		//throw new ArrayIndexOutOfBoundsException("Exceção do tipo \"ArrayIndexOutOfBoundsException\"."); // Força para que a exeção ocorra.
		//System.out.println(num[10]); // Provoca a exceção por meio de ação ilegal.
		
		// Gera uma exceção do tipo "IllegalStateException". Esse tipo de exceção não obriga o tratamento no código.
		//throw new IllegalStateException("Exceção do tipo \"IllegalStateException\"."); // Força para que a exeção ocorra.
		
		// Gera uma exceção do tipo "Exception". Esse tipo de exceção obriga o tratamento no código.
		//throw new Exception("Exceção do tipo \"Exception\"."); // Força para que a exeção ocorra.
		
	}

}
