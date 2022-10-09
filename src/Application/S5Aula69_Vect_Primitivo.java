package Application;

import java.util.Locale;
import java.util.Scanner;

public class S5Aula69_Vect_Primitivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] vetor = new double[n];
		
		for (int i=0 ; i<n ;i++) {
			vetor[i] = sc.nextDouble(); 
		}
		
		double sum = 0;		
		for(int i = 0; i<n ; i++) {
			sum += vetor[i];
		}
		
		System.out.printf("AVERAGE HEIGHT: %.2f",sum/3);
		
		sc.close();
	}

}
