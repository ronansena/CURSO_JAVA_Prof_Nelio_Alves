package course;

import java.util.Locale;
import java.util.Scanner;
import entities.Retangulo;

public class S3Aula50Exerc1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Entre com a altura do retângulo:");
		retangulo.height = sc.nextDouble();
		System.out.println("Entre com a largura do retângulo:");
		retangulo.width = sc.nextDouble();
				
		System.out.printf("AREA:%.2f%n",retangulo.areaCalculada());
		System.out.printf("PERIMETER:%.2f%n",retangulo.perimetroCalculado());
		System.out.printf("DIAGONAL:%.2f%n", retangulo.diagonalCalculada());
		
		sc.close();
	}

}
