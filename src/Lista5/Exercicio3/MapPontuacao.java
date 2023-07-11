/*
 Lista de exercícios: 5.
 Exercício: 3.
 */

package Lista5.Exercicio3;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


public class MapPontuacao {

	public static void main(String[] args) {
		
		HashMap<String, Integer> timePontuacao = new HashMap<>();
		timePontuacao.put("Fluminense", 50);
		timePontuacao.put("Corinthians", 90);
		timePontuacao.put("Botafogo", 85);
		timePontuacao.put("Vasco", 100);
		timePontuacao.put("Internacional", 60);
		timePontuacao.put("Flamengo", 30);
		timePontuacao.put("Athlético", 45);
		timePontuacao.put("Fortaleza", 62);
		timePontuacao.put("São Paulo", 72);
		timePontuacao.put("América", 58);
		timePontuacao.put("Santos", 59);
		timePontuacao.put("Goiás", 68);
		timePontuacao.put("Coritiba", 58);
		timePontuacao.put("Cuiabá", 78);
		timePontuacao.put("Grêmio", 77);		
		timePontuacao.put("Palmeiras", 83);
		timePontuacao.put("Bahia", 79);
		timePontuacao.put("Cruzeiro", 61);				
	
		System.out.println("O time com a maior pontuação é o \"" + getTeamWithHighestScore(timePontuacao) + "\".");		
		
	}	
	
	public static String getTeamWithHighestScore(Map<String, Integer> scores) {
		
		int maiorPontuacao = 0;
		String timeMaiorPontuacao = "nenhum";
		
		for (String i : scores.keySet()) {			
			
			if((scores.get(i)) > maiorPontuacao) {				
				timeMaiorPontuacao = i;		
				maiorPontuacao = scores.get(i);
			}			
		}
		
		return timeMaiorPontuacao;
		
	}
	
}
