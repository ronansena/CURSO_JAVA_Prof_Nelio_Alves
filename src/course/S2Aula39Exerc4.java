package course;

import java.util.Locale;
import java.util.Scanner;

public class S2Aula39Exerc4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	
				
		for (int x = 1; x <= n; x++ ) {
				double value1 = sc.nextDouble();				
				double value2 = sc.nextDouble();
							
				if (value2 == 0) {
					System.out.println("Divisão impossível");
				}
				else {
				double divisao = (double) value1/value2;						
				System.out.printf("%.1f%n",divisao);
				}
			}	
					
		sc.close();	
	}

}
