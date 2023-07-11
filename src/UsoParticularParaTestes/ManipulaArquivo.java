package UsoParticularParaTestes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ManipulaArquivo {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter arquivo = null;
		
		try {
			arquivo = new FileWriter(new File("teste"));
			arquivo.write("Teste de escrita.");
			System.out.println("Escreveu no arquivo.  ");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			arquivo.close();
		}
	}
	
}
