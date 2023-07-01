/*
 Lista de exercícios: 2.
 Exercício: 5.
 */

package Exercicios2;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroContas {
	
	private static ArrayList<Conta> contas = new ArrayList<Conta>();
		
	public static void main(String args[]) {		
		
		Scanner sc = new Scanner(System.in);
		char opcao = ' ';
		int numeroConta;
		Double limiteSaque;
		Double valor;
							
		while (opcao != 'q') {			
		
			System.out.println("\n### Sistema Bancário ###\n");
			System.out.println("Uso: ");
			System.out.println("   Criar uma conta: 'c'");
			System.out.println("   Remover uma conta: 'r'");
			System.out.println("   Listar uma conta: 'l'");
			System.out.println("   Listar todas as contas: 'L'");		
			System.out.println("   Depositar numa conta: 'd'");
			System.out.println("   Sacar de uma conta: 's'");
			System.out.println();
			
			opcao = sc.next().trim().charAt(0);
			
			switch (opcao) {
			
				case 'c': // Criação de conta.
					
					System.out.println("Selecione a opção:");
					System.out.println("   1 --> para conta genérica.");
					System.out.println("   2 --> para conta corrente");
					opcao = sc.next().trim().charAt(0);
					switch (opcao) {
						case '1':
							System.out.println("Informe o número da conta:");
							numeroConta = sc.nextInt();	
							Conta conta = new Conta(numeroConta);
							contas.add(conta);
						break;
						case '2':
							System.out.println("Informe o número da conta:");
							numeroConta = sc.nextInt();							
							System.out.println("Informe o limite de saque:");							
							limiteSaque = sc.nextDouble();
							ContaCorrente contaCorrente = new ContaCorrente(numeroConta, limiteSaque);
							contas.add(contaCorrente);
						break;
					}	
					
				break;
					
				case 'r': // Remoção de conta.
					
					System.out.println("Informe o número da conta:");
					numeroConta = sc.nextInt();
					for (int i = 0; i < contas.size(); i++) {
						if (contas.get(i).getConta() == numeroConta) {
							contas.remove(i);
						}						
					}

				break;
				
				case 'l':
					
					System.out.println("Informe o número da conta:");
					numeroConta = sc.nextInt();
					for (int i = 0; i < contas.size(); i++) {
						if (contas.get(i).getConta() == numeroConta) {
							System.out.println("Número da conta: " + contas.get(i).getConta() + ", Saldo: " + contas.get(i).getSaldo());
						}						
					}
					
				break;
				
				case 'L':
					
					for (int i = 0; i < contas.size(); i++) {
						System.out.println("Número da conta: " + contas.get(i).getConta() + ", Saldo: " + contas.get(i).getSaldo());											
					}
					
				break;				
				
				case 'd':
					System.out.println("Informe o número da conta:");
					numeroConta = sc.nextInt();
					System.out.println("Informe o valor a ser depositado:");
					valor = sc.nextDouble();
					
					for (int i = 0; i < contas.size(); i++) {
						if (contas.get(i).getConta() == numeroConta) {
							contas.get(i).depositar(valor);
						}						
					}
				break;
				
				case 's':
					
					System.out.println("Informe o número da conta:");
					numeroConta = sc.nextInt();
					System.out.println("Informe o valor que deseja sacar:");
					valor = sc.nextDouble();
					
					for (int i = 0; i < contas.size(); i++) {
						if (contas.get(i).getConta() == numeroConta) {
							contas.get(i).sacar(valor);
						}						
					}
					
				break;
				
				case 'q':
					
					System.out.println("\nFIM DE EXECUÇÃO DO SISTEMA");
					
				break;				
				
				default:
					
					System.out.println("Opçao inválida!");
					
			}
			
		}
		
		sc.close();
		
	}
			
}
