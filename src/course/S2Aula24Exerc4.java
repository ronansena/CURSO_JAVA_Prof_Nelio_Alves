package course;

import java.util.Scanner;

public class S2Aula24Exerc4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int hora1,hora2;
		System.out.println("Entre com a hora inicial:");
		hora1 = sc.nextInt();
		System.out.println("Entre com a hora final:");
		hora2 = sc.nextInt();		
	
		if (hora1 < hora2) {			
			System.out.println("O JOGO DUROU "+(hora2-hora1)+" HORA(S)");
		}
		else 
			System.out.println("O JOGO DUROU "+((24-hora1)+hora2)+" HORA(S)");	
		sc.close();
	}

}
