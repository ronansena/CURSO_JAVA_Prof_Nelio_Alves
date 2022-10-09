package course;

import java.util.Locale;
import java.util.Scanner;

//https://www.youtube.com/watch?v=Ah1Y6d6deq0
public class S2ExercResolved {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entre com a largura do terreno:");
		double largura = sc.nextDouble();
		
		System.out.println("Entre com o comprimento do terreno:");
		double comprimento = sc.nextDouble();
		
		System.out.println("Entre com o valor do metro quadrado do terreno:");
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado ;
		
		System.out.printf("Área total terreno:%.2f%n",area);
		System.out.printf("Preço do terreno:%.2f%n",preco);		
		
		sc.close();
	}

}
