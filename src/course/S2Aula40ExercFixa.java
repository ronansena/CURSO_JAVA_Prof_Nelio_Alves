package course;

import java.util.Scanner;

public class S2Aula40ExercFixa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number:");
		int n = sc.nextInt();		
		while(n<=0) {
			System.out.println("N must be positive! Try again:");
			n = sc.nextInt();			
		}
		
		int maiorValue = Integer.MIN_VALUE;
		for (int i=1;i<=n;i++) {
			System.out.println("Value #"+i+":");
			int value = sc.nextInt();
			if(value > maiorValue) {
			   maiorValue = value;
			}		
		}
		
		System.out.println("Highter:"+ maiorValue);
		sc.close();
	}

}
