package course;

import java.util.Scanner;

public class S2Aula39Exerc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int valorInteiro = sc.nextInt();
		
		for (int x = 1; x <= valorInteiro; x++ ) {			
			if(x%2 > 0)				
			System.out.println(x);				
		}
		
		sc.close();

	}

}
