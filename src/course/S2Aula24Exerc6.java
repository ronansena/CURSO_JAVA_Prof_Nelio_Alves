package course;

import java.util.Locale;
import java.util.Scanner;

public class S2Aula24Exerc6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);	
		
		Scanner sc = new Scanner(System.in);
		
		double num1 = sc.nextDouble();
		
		if(num1 < 0 || num1 > 100) {
			System.out.println("Fora de intervalo!");
		}
		else if(num1 <= 25) {
			System.out.println("Intervalo [0,25]");			
		}
		else if(num1 <= 50) {
			System.out.println("Intervalo (25,50]");			
		}
		else if(num1 <= 75) {
			System.out.println("Intervalo (50,75]");
		}
		else
			System.out.println("Intervalo (75,100]");
		
		sc.close();
	}

}
