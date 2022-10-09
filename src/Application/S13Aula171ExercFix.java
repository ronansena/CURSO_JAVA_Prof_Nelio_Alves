package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

public class S13Aula171ExercFix {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter contract data:");
		System.out.println("Number:");
		int numberContract = sc.nextInt();
		System.out.println("Date (dd/MM/yyyy):");
		Date date = sdf.parse(sc.next());
		System.out.println("Contract value:");
		double totalValue = sc.nextDouble();
		System.out.println("Enter number of installments:");
		Integer months = sc.nextInt();

		Contract contract = new Contract(numberContract, date, totalValue);
		ContractService contractService = new ContractService(new PaypalService());

		contractService.processContract(contract, months);

		System.out.println("Installments:");
		
		for (Installment installments : contract.getInstallments()) {
			System.out.println(installments.toString());
		}	

		sc.close();

	}

}
