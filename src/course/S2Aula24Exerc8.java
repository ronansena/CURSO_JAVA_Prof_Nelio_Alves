package course;

import java.util.Locale;
import java.util.Scanner;

public class S2Aula24Exerc8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);	
		
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		double imposto;
		
		if(salario <= 2000.00) {
			imposto = 0.00;
		}
		else if(salario<=3000.00) {
			imposto = ((salario - 2000.00)*8)/100;				
		}
		else if(salario<=4500.00) {			
			imposto = (((salario - 3000.00)*18)/100)+80.00;				
		}
		else {
			imposto = (((salario - 4500.00)* 0.28) + 1500 * 0.18 + 1000 * 0.08 );				
		}	
		
		if (imposto == 0.00)
			System.out.printf("Isento!");
		else
			System.out.printf("R$ %.2f%n",imposto);
		
		sc.close();
	}

}
