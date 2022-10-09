package course;

import java.util.Scanner;

public class S2Aula24Exerc5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int qtdeItem,codItem;
		double cachorroQuente,xSalada,xbacon,torradaSimples,refrigerante;
		System.out.println("Entre código do item:");
		codItem = sc.nextInt();
		System.out.println("Entre com a quantidade do item:");
		qtdeItem = sc.nextInt();		
	
		cachorroQuente = qtdeItem * 4.00;
		xSalada = qtdeItem * 4.50;
		xbacon = qtdeItem * 5.00;	
		torradaSimples = qtdeItem * 2.00;
		refrigerante = 	qtdeItem * 1.50;
		
		if (codItem == 1) {			
			System.out.printf("Total: R$ %.2f%n",cachorroQuente);	
		}
		else if (codItem == 2) {
			System.out.printf("Total: R$ %.2f%n",xSalada);	
		}
		else if (codItem == 3) {
			System.out.printf("Total: R$ %.2f%n",xbacon);	
		}
		else if (codItem == 4) {
			System.out.printf("Total: R$ %.2f%n",torradaSimples);	
			
		}
		else if (codItem == 5) {
			System.out.printf("Total: R$ %.2f%n",refrigerante);	
		}
		
		sc.close();
	}

}
