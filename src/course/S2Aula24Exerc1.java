package course;

import java.util.Scanner;

public class S2Aula24Exerc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in);
		
		int num1;
		System.out.println("Enter an interger number: ");
		num1 = sc.nextInt();
		
		if (num1 >= 0) {
			System.out.println("NÃO NEGATIVO");
		}
		else
			System.out.println("NEGATIVO");
		sc.close();

	}

}
