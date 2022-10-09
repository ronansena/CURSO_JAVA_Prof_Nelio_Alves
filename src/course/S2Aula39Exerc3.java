package course;

import java.util.Locale;
import java.util.Scanner;

public class S2Aula39Exerc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeroEntradas = sc.nextInt();	
		
		for (int x = 1; x <= numeroEntradas; x++ ) {
				double value1 = sc.nextDouble();				
				double value2 = sc.nextDouble();
				double value3 = sc.nextDouble();	
				
				double mediaPoderada = ((value1*2.0)+(value2*3.0)+(value3*5.0))/(10);	
				
				System.out.printf("%.1f%n",mediaPoderada);
				
			}			
					
		sc.close();	
	}
}
