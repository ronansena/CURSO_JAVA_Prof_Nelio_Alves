package course;

import java.util.Scanner;

public class S2Aula24ExercFix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
				
		if (num1 > num2 && num1 > num3) {
			System.out.println("HIGHER:"+num1);
		}
		else if (num2 > num3) {
			System.out.println("HIGHER:"+num2);
		}
		else
			System.out.println("HIGHER:"+num3);	
		
		sc.close();

	}

}
