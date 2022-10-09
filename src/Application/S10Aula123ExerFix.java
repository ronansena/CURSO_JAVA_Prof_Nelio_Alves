package Application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class S10Aula123ExerFix {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter account data: ");
			System.out.println("Number:");
			int number = sc.nextInt();
			System.out.println("Holder:");
			String holder = sc.next();
			System.out.println("Initial balance:");
			double balance = sc.nextDouble();
			System.out.println("Withdraw limit:");
			double withdrawLimit = sc.nextDouble();

			Account account = new Account(number, holder, balance, withdrawLimit);

			System.out.println("Enter amount for withdraw:");
			double amount = sc.nextDouble();

			account.withDraw(amount);
			System.out.printf("New balance: %.2f", account.getBalance());
		} 
		catch (DomainException e) {
			System.out.printf("Withdraw error:"+ e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}	
		sc.close();
	}

}
