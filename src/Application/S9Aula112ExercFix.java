package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuintes;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class S9Aula112ExercFix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Contribuintes> list = new ArrayList<>();

		System.out.println("Enter the number of tax payers:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.println("Individual or company (i/c)?");
			char type = sc.next().charAt(0);
			System.out.println("Name:");
			String nome = sc.next();
			System.out.println("Anual income:");
			double gastosAnual = sc.nextDouble();

			if (type == 'i') {
				System.out.println("Health expenditures:");
				double gastosSaude = sc.nextDouble();
				PessoaFisica pf = new PessoaFisica(nome, gastosAnual, gastosSaude);
				list.add(pf);
			} else {
				System.out.println("Number of employees:");
				int numeroFuncionarios = sc.nextInt();
				PessoaJuridica pj = new PessoaJuridica(nome, gastosAnual, numeroFuncionarios);
				list.add(pj);
			}
		}
		System.out.println();
		System.out.println("TAXES PAID:");

		double totalImpostos = 0;
		for (Contribuintes cont : list) {
			totalImpostos += cont.calculoImposto();
			System.out.println(cont);
		}
		System.out.println();
		System.out.println("TOTAL TAXES: $ "+String.format("%.2f", totalImpostos));
		
		sc.close();

	}

}
