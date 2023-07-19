/*
 Lista de exercícios: 7 (Calculadora - Framework e Padrões de Projeto).
 Exercício: 3.
 */

package Lista7.CalculadoraExercicio4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ArmazenamentoArquivo implements  Armazenamento {
	private String diretorio = "./";

	@Override
	public void salvarExpressao(String id, String expressao) {
		try (FileOutputStream fileOutputStream = new FileOutputStream(diretorio + id + "_expressao.obj");
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
			objectOutputStream.writeObject(expressao);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void salvarOperacao(String id, Nodo operacao) {
		try (FileOutputStream fileOutputStream = new FileOutputStream(diretorio + id + "_operacao.obj");
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
			objectOutputStream.writeObject(operacao);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void salvarResultado(String id, double resultado) {
		try (FileOutputStream fileOutputStream = new FileOutputStream(diretorio + id + "_resultado.obj");
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
			objectOutputStream.writeObject(new Double(resultado));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String recuperarExpressao(String id) {
		try (FileInputStream fileInputStream = new FileInputStream(diretorio + id + "_expressao.obj");
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
			return (String) objectInputStream.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Operacao recuperarOperacao(String id) {
		try (FileInputStream fileInputStream = new FileInputStream(diretorio + id + "_operacao.obj");
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
			return (Operacao) objectInputStream.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public double recuperarResultado(String id) {
		try (FileInputStream fileInputStream = new FileInputStream(diretorio + id + "_resultado.obj");
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
			return (Double) objectInputStream.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<String> listarExpressoes() {
		List<String> expressoes = new ArrayList<String>();
		File dir = new File(diretorio);
		File files[] = dir.listFiles();
		if(files != null) {
			for (File file : files) {
				if(file.getName().endsWith("_expressao.obj")) {
					String id = file.getName().replace("_expressao.obj", "");
					expressoes.add(id);
				}
			}
		}
		return expressoes;
	}	
		
}