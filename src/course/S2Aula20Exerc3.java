package course;

import java.util.Locale;
import java.util.Scanner;

public class S2Aula20Exerc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);	
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		
		System.out.println("Diferença:"+ ((num1*num2)-(num3*num4)));	
		sc.close();
	}

}
