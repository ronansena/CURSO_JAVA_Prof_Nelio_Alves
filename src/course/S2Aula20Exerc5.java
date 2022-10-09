package course;

import java.util.Locale;
import java.util.Scanner;


public class S2Aula20Exerc5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		int i,numPeca;
		double valorUnitPeca,valorParcial = 0;
		
		for(i=0;i<2;i++)
		{
			System.out.println("Entre com o código de barras:");
			sc.nextInt();
			System.out.println("Entre com a quantidade de peças:");
			numPeca = sc.nextInt();
			System.out.println("Entre com o valor unitário da peça:");
			valorUnitPeca = sc.nextDouble();		
			valorParcial += (numPeca * valorUnitPeca);	
		}
		System.out.printf("VALOR A PAGAR: R$ %.2f%n",valorParcial);			
		sc.close();
		

	}

}
