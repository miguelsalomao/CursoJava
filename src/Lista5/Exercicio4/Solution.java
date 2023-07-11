/*
 Lista de exercícios: 5.
 Exercício: 4.
 */

package Lista5.Exercicio4;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
	
	public static void main(String[] args) {
		
		String string1 = "()[]{}";
		String string2 = "([)]";
		String string3 = "{[]}(()(()({[()]})))()";
		
		System.out.println("String 1:" + string1);
		System.out.println("E valida?:" + isValidMesmaImplementacaoSemUsarMap(string1));
		
		System.out.println("\nString 2:" + string2);
		System.out.println("E valida?:" + isValidMesmaImplementacaoSemUsarMap(string2));
		
		System.out.println("\nString 3:" + string3);
		System.out.println("E valida?:" + isValidMesmaImplementacaoSemUsarMap(string3));
		
	}	
	
	public static boolean isValidImplementacaoMaisEnxuta(String s) {
		
		Map<Character, Character> parentesisMap = new HashMap<>();
		parentesisMap.put('(', ')');
		parentesisMap.put('{', '}');
		parentesisMap.put('[', ']');
		
		Stack<Character> stack = new Stack<>();
		
		for(char c : s.toCharArray()) {
			if (parentesisMap.containsKey(c)) {
				stack.push(c);
			}else if (parentesisMap.get(stack.pop()) != c) {
				return false;
			}
		}
		
		return stack.isEmpty();
		
	}
	
	// Pela lógica interpretada pelo professor na correção do exercício. Sem usar Map.
	public static boolean isValidMesmaImplementacaoSemUsarMap(String s) {
		
		char[] caractere = s.toCharArray();
		Stack<Character> pilha = new Stack<>();
		Character abertura;
		
		for (char i : caractere) {
			if (i == '(' || i == '[' || i == '{') {
				pilha.push(i);
			}else if (!pilha.empty()){
				abertura = pilha.pop();
				if (((abertura == '(') && (i != ')')) || ((abertura == '[') && (i != ']')) || ((abertura == '{' && i != '}'))){
					return false;
				}
			}else {
				return false;
			}
		}
		
		// Se faltou qualquer parêntesis, colchetes ou chaves sem fechar, entao retornara "falso".
		return pilha.empty();
		
	}	
	
	// Usando switch-case ao invés de If. Considera apenas que todas as aberturas são fechadas, mas não respeira a ordem.
	public static boolean isValidSwitchCase(String s) { 
		
		char[] caractere = s.toCharArray();
		
		Stack<Character> pilhaParentesis = new Stack<>();
		Stack<Character> pilhaColchetes = new Stack<>();
		Stack<Character> pilhaChaves = new Stack<>();
		
		for (char i : caractere) {
			
			switch (i) {
			
			case '(':				
				pilhaParentesis.push('(');
			break;
			
			case ')':				
				if(pilhaParentesis.empty()) {
					return false;
				}else {					
					pilhaParentesis.pop();
				}				
			break;
			
			case '[':
				pilhaColchetes.push('[');
			break;
			
			case ']':
				if(pilhaColchetes.empty()) {
					return false;
				}else {
					pilhaColchetes.pop();					
				}
			break;
			
			case '{':
				pilhaChaves.push('{');
			break;
			
			case '}':
				if(pilhaChaves.empty()) {
					return false;					
				}else {
					pilhaChaves.pop();
				}
			break;
			
			default:
				return false;
				
			}
						
		}
		
		// Se faltou qualquer parêntesis, colchetes ou chaves sem fechar.
		if (pilhaParentesis.empty() && pilhaColchetes.empty() && pilhaChaves.empty()) {
			return true;
		}else {
			return false;
		}
		
	}
	
	// Interpretando o enunciado do exercício ao "pé da letra". Aqui é considerada a ordem "{[()]}" sem possibilidade de hierarquia usando o mesmo tipo de simbolo.
	public static boolean validacaoAlgebrica(String s) {
		
		char[] caractere = s.toCharArray();
		
		Stack<Character> pilha = new Stack<>();			
		
		for (char i : caractere) {
			
			switch (i) {
				
			case '(':
				if (pilha.empty() || (pilha.peek().charValue() == '[') || (pilha.peek().charValue() == ')') || (pilha.peek().charValue() == ']')
						|| (pilha.peek().charValue() == '}')) {
					pilha.push('(');					
				}else {
					return false;
				}
			break;
			
			case ')':				
				if(!pilha.empty() && pilha.peek().charValue() == '(') {
					pilha.pop();
				}else {
					return false;
				}
			break;
			
			case '[':
				if (pilha.empty() || (pilha.peek().charValue() == '{') || (pilha.peek().charValue() == ')') || (pilha.peek().charValue() == ']') 
						|| (pilha.peek().charValue() == '}')) {
					pilha.push('[');
				}else {
					return false;
				}
			break;
			
			case ']':
				if(!pilha.empty() && pilha.peek().charValue() == '[') {
					pilha.pop();
				} else {
					return false;
				}
			break;
			
			case '{':
				if (pilha.empty() || (pilha.peek().charValue() == ')') || (pilha.peek().charValue() == ']') || (pilha.peek().charValue() == '}')) {
					pilha.push('{');
				}else {
					return false;
				}
			break;
			
			case '}':
				if(!pilha.empty() && pilha.peek().charValue() == '{') {
					pilha.pop();
				} else {
					return false;
				}
			break;
			
			default:
				return false;
				
			}
		}
		
		// Se faltou qualquer parêntesis, colchetes ou chaves sem fechar.
		if (pilha.empty()) {
			return true;
		}else {
			return false;
		}		
		
	}
	
}
