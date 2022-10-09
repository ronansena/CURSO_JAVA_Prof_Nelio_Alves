package course;

import java.util.Locale;
import java.util.Scanner;

public class S2Aula20Exerc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o número do funcionário:");
		int numberFunc = sc.nextInt();
		System.out.println("Entre com o número de horas extras trabalhadas:");
		int numberHourExtra = sc.nextInt();		
		System.out.println("Valor por hora extra trabalhada:");
		double valorHoraExtra = sc.nextDouble();
		
		System.out.println("NUMBER = "+numberFunc);
		System.out.printf("SALARY = U$ %.2f%n",numberHourExtra*valorHoraExtra);	
		
		sc.close();	

	}

}
