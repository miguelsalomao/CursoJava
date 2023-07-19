/*
	Não houve um exercício prático específico de tratamento de exceções. Criei esse para testar os conceitos.
 */

package Lista6.Exception;

// Provoca e trata diversos tipos de exceção.
public class TratamentoExcecoes {
	public static void main(String[] args) {
		
	// ### Testes de lançamento de exceção sem tratamento:  ##################################################################################
	
	// EXEMPLOS DE LANÇAMENTO DE EXCEÇÃO DO TIPO "VERIFICADA" (CHECKED). Qualquer destas linhas geram erro de compilação, pois exeções 
	// verificadas devem ser obrigatoriamente tratadas dentro de um bloco "try-catch".
		
		//metodoLancaExcecoes(numeros); // Chama um método que lança uma exceção do tipo Exception, que é do tipo "verificada".
		//ExcecaoVerificada.lancaExceptionSeMenorZero(-1); // Chama um método que lança uma exceção do tipo ExcecaoVerificada, que por ser uma
														   // exceção que herda de Exception é também do tipo "verificada".
		
	// EXEMPLOS DE LANÇAMENTO DE EXCEÇÃO DO TIMPO "NÃO VERIFICADA" (UNCKECKED). As linhas a seguir não geram erro em tempo de compilação. Caso 
	// ocorra a exceção em tempo de	execução será exibida uma mensagem de erro padrão (stack trace).
		
		//ExcecaoNaoVerificada.lancaRunTimeException(-1); // Chama um método que lança uma exceção do tipo ExcecaoNaoVerificada, que por ser
														  // uma exceção que herda de RuntimeException é também do tipo "não verificada".
		//int numeros[] = new int[3]; System.out.println(numeros[3]); // Provoca uma exceção do tipo ArrayIndexOutOfBoundsException.
		
//############################################################################################################################################
		
		try { // Tentativa de fazer alguma coisa.								
			
			//metodoLancaExcecoes();
			
			//ExcecaoNaoVerificada.lancaRunTimeException(-1);
			ExcecaoVerificada.lancaExceptionSeMenorZero(-1);
			//if (true) throw new Exception("O número não pode ser menor que zero.");
			
			System.out.println("Não gerou exceção."); // Se executar essa linha é porque não foi gerada exceção.			
		
		}		
		
		catch(ExcecaoNaoVerificada e){			
			 
			System.out.println("Entrou no \"catch\" de ExcecaoNaoVerificada.");
			System.out.println(e.getMessage()); 
		}
		
		
		
		catch(ArrayIndexOutOfBoundsException e){
		 
			System.out.println("Entrou no \"catch\" de ArrayIndexOutOfBoundsException.");
			System.out.println(e.getMessage()); 
		}
		
		catch(IllegalStateException e){
			 
			System.out.println("Entrou no \"catch\" de IllegalStateException.");
			System.out.println(e.getMessage()); 
		}		
		
		catch(ExcecaoVerificada e){ // Como se trata de exceção do tipo "verificada" só é permitido declarar esse bloco se houver esse tipo de 
		 							// exceção no "try".
			 
			System.out.println("Entrou no \"catch\" de ExcecaoVerificada.");
			System.out.println(e.getMessage()); 
		}
		
		catch(Exception e) {
			System.out.println("Entrou no \"catch\" de Exception.");
			System.out.println(e.getMessage());
			//e.printStackTrace(); // Se quiser usar o Stack Trace.
		}
		 
		finally{		 
			System.out.println("Linha de código do \"finally\".");		 
		}		
		
	}
	
	// Método passível de gerar exceção.
	public static void metodoLancaExcecoes() throws Exception { // o throws aqui significa "pode tratar exceção" no caso de exceção verificada. RuntimeException não é uma exceção verificada, apesar de herdar de Exception (o compilador entende isso). Todas que herdam de RuntimeException não são verificadas, todas que herdam de Exception são verificadas.
		ExcecaoVerificada.lancaExceptionSeMenorZero(-1);
		// Gera uma exceção do tipo ArrayIndexOutOfBoundsException.
		//throw new ArrayIndexOutOfBoundsException("Exceção do tipo \"ArrayIndexOutOfBoundsException\"."); // Força para que a exeção ocorra.
		//System.out.println(num[10]); // Provoca a exceção por meio de ação ilegal.
		
		// Gera uma exceção do tipo "IllegalStateException". Esse tipo de exceção não obriga o tratamento no código.
		//throw new IllegalStateException("Exceção do tipo \"IllegalStateException\"."); // Força para que a exeção ocorra.
		
		// Gera uma exceção do tipo "Exception". Esse tipo de exceção obriga o tratamento no código.
		//throw new Exception("Exceção do tipo \"Exception\"."); // Força para que a exeção ocorra.
		
	}

}
