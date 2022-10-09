package course;

import java.util.Scanner;

public class S2Aula39Exerc5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(),fatorial = n;	
				
		if (n != 0) {
		for (int x = n; x > 1;x--) {
			fatorial = fatorial * (x-1);	
			
		}	
		    System.out.println(fatorial);
		}
		else
			System.out.println(1);
		sc.close();	
	}
}
