/*
 Lista de exercícios: 2.
 Exercício: 5.
 */

package Lista2.Exercicio5;

import java.util.ArrayList;
import java.util.Scanner;

import Lista2.Exercicio2.Conta;
import Lista2.Exercicio2.ContaCorrente;

public class CadastroContas {
	
	private static Scanner sc = new Scanner(System.in);
	private ArrayList<Conta> contas = new ArrayList<Conta>();
	private int numeroConta;
	private Double limiteSaque;
	private Double valor;
		
	public static void main(String args[]) {		
				
		char opcao = ' ';
		CadastroContas cadastroConta = new CadastroContas();
							
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
			
				case 'c': // Criar uma conta.					
					cadastroConta.criaConta();			 			
				break;
					
				case 'r': // Remover uma conta.					
					cadastroConta.removeConta();
				break;
				
				case 'l': //					
					cadastroConta.listaUmaConta();					
				break;
				
				case 'L':					
					cadastroConta.listaTodasContas();					
				break;				
				
				case 'd':
					cadastroConta.depositaConta();
				break;
				
				case 's':
					cadastroConta.sacaConta();
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
	
	public void criaConta() {
		
		char opcaoConta = ' ';		
		
		System.out.println("Selecione a opção:");
		System.out.println("   1 --> para conta genérica.");
		System.out.println("   2 --> para conta corrente");
		opcaoConta = sc.next().trim().charAt(0);
		switch (opcaoConta) {
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
		
	}
	
	public void removeConta(){
		
		System.out.println("Informe o número da conta:");
		numeroConta = sc.nextInt();
		for (int i = 0; i < contas.size(); i++) {
			if (contas.get(i).getConta() == numeroConta) {
				contas.remove(i);
			}						
		}
		
	}
	
	public void listaUmaConta() {
		
		System.out.println("Informe o número da conta:");
		numeroConta = sc.nextInt();
		for (int i = 0; i < contas.size(); i++) {
			if (contas.get(i).getConta() == numeroConta) {
				System.out.println("Número da conta: " + contas.get(i).getConta() + ", Saldo: " + contas.get(i).getSaldo());
			}						
		}
		
	}
	
	public void listaTodasContas(){
		
		for (int i = 0; i < contas.size(); i++) {
			System.out.println("Número da conta: " + contas.get(i).getConta() + ", Saldo: " + contas.get(i).getSaldo());											
		}
		
	}
	
	public void depositaConta() {
		
		System.out.println("Informe o número da conta:");
		numeroConta = sc.nextInt();
		System.out.println("Informe o valor a ser depositado:");
		valor = sc.nextDouble();
		
		for (int i = 0; i < contas.size(); i++) {
			if (contas.get(i).getConta() == numeroConta) {
				contas.get(i).depositar(valor);
				System.out.println("\nNúmero da conta: " + contas.get(i).getConta() + ", Saldo: " + contas.get(i).getSaldo());
			}						
		}
				
	}
	
	public void sacaConta() {
		
		System.out.println("Informe o número da conta:");
		numeroConta = sc.nextInt();
		System.out.println("Informe o valor que deseja sacar:");
		valor = sc.nextDouble();
		
		for (int i = 0; i < contas.size(); i++) {
			if (contas.get(i).getConta() == numeroConta) {
				contas.get(i).sacar(valor);
				System.out.println("\nNúmero da conta: " + contas.get(i).getConta() + ", Saldo: " + contas.get(i).getSaldo());
			}						
		}
		
	}
			
}
