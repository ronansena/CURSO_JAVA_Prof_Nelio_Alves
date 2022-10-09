package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class S4Aula62ExercFix {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;

		// Entrada de dados
		System.out.println("Informe o número da conta:");
		int numeroConta = sc.nextInt();
		System.out.println("Informe o nome do correntista:");
		sc.nextLine();
		String nomeCorrentista = sc.nextLine();
		System.out.println("Deseja informar valor de depósito? (Sim ou Não)");
		char response = sc.next().charAt(0);

		if (response == 'S') {
			System.out.println("Informe o valor do depósito inicial:");
			double valorInicialDeposito = sc.nextDouble();
			account = new Account(numeroConta, nomeCorrentista, valorInicialDeposito);
		} else {
			account = new Account(numeroConta, nomeCorrentista);
		}

		// Mostrar dados
		System.out.println();
		System.out.println("Dados da conta:\n" + account);

		System.out.println();
		System.out.print("Digite o valor do depósito:");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);

		System.out.println();
		System.out.println("Atualização dos dados da conta:\n" + account);

		System.out.println();
		System.out.print("Digite o valor do Saque:");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);

		System.out.println("Atualização dos dados da conta:\n" + account);

		sc.close();
	}

}
