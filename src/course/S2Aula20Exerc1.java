package course;

import java.util.Scanner;

public class S2Aula20Exerc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int numberOne = sc.nextInt();
		int numberTwo = sc.nextInt();
		
		int soma = numberOne + numberTwo;
		
		System.out.println("Soma:"+ soma );		
		
		sc.close();
	}

}
