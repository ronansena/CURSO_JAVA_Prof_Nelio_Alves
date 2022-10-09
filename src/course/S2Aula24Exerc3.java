package course;

import java.util.Scanner;

public class S2Aula24Exerc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
		
		int num1,num2;
		System.out.println("Enter an interger number: ");
		num1 = sc.nextInt();
		System.out.println("Enter an interger number: ");
		num2 = sc.nextInt();
						
		if (num1%num2 == 0 || num2%num1 == 0 )	{
			System.out.println("São múltiplos!");
		}
		else {
			System.out.println("Não são múltiplos!");
		}		
		sc.close();
	}

}
