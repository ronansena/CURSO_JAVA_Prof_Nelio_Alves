package course;

import java.util.Scanner;

public class S2Aula39Exerc7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	
		
		for(int i=1; i<=n; i++) {
			System.out.println (i +" "+ i*i +" "+ i*i*i);			
		}		
		
		/*
		    Outra forma de fazer conforme Professor Nélio: 
		 	int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro); 
		 */
		sc.close();
	}

}
