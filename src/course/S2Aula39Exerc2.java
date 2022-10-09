package course;

import java.util.Scanner;

public class S2Aula39Exerc2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	
		int numeroEntradas = sc.nextInt();
		int qtdeOut=0;
		int qtdeIn=0;
	
		for (int x = 1; x <= numeroEntradas; x++ ) {			
			int value = sc.nextInt();
			
			if(value >=10 && value <= 20) {
				qtdeIn++;				
			}
			else
				 qtdeOut++;								
		}	
		System.out.println(qtdeIn +" in");	
		System.out.println(qtdeOut +" out");	
		
		sc.close();		
	}	

}
