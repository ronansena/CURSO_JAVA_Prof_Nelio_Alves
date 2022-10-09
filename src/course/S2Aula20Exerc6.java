package course;

import java.util.Locale;
import java.util.Scanner;

public class S2Aula20Exerc6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o valor de A:");
		double valorA = sc.nextDouble();
		System.out.println("Entre com o valor de B:");
		double valorB = sc.nextDouble();
		System.out.println("Entre com o valor de C:");
		double valorC = sc.nextDouble();
		
		System.out.printf("TRIANGULO:%.3f%n",(valorA*valorC)/2);// base elevada ao quadrado dividido por 2
		System.out.printf("CÍRCULO:%.3f%n",((valorC*valorC)* 3.14159)); //base elevada ao quadrado vezes o valor do PII
		System.out.printf("TRAPÉZIO:%.3f%n",((valorA+valorB)*valorC)/2); // soma das bases vezes a altura dividido por 2
		System.out.printf("QUADRADO:%.3f%n",(valorB*valorB)); //valor de um dos lados ao quadrado, ou base vezes altura
		System.out.printf("RETÂMGULO:%.3f%n",(valorA*valorB)); //valor da base vezes a altura
		
		sc.close();

	}

}
