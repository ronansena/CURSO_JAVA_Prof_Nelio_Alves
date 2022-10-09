package course;

import java.util.Scanner;

public class S2Aula24Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num1,num2;
		System.out.println("Enter an interger number: ");
		num1 = sc.nextInt();
		System.out.println("Enter an interger number: ");
		num2 = sc.nextInt();
						
		if (num1%2 == 0 )	{
			System.out.println("The number " +num1+" is ever!");
		}
		else {
			System.out.println("The number " +num1+" is odd!");
		}
		if (num2%2 == 0 )	{
			System.out.println("The number " +num2+" is ever!");
		}
		else {
			System.out.println("The number " +num2+" is odd!");
		}
		sc.close();
		
	}

}
