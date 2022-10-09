package course;

import java.util.Scanner;

public class S2Aula39Exerc6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	
		
		for(int x = n; x>0; x--) {				
				if(n%x == 0) {
					System.out.println(x);	
				}				
				sc.close();
		}
	}
}
