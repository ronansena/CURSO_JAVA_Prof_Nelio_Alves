package course;

import java.util.Scanner;

public class S2Aula36Exerc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
		
		System.out.println(" Informe o combustível de preferência: 1.Álcool 2.Gasolina 3.Diesel 4.Fim");
		int escolha = sc.nextInt();
		int alcool = 0, gasolina = 0, diesel = 0;
		
		while (escolha != 4) {
			switch (escolha) {
			case 1:
				alcool ++;
				break;
			case 2:
				gasolina ++;
				break;
			case 3:
				diesel ++;
				break;				
			}	
			
		if (escolha < 1 || escolha > 4) 
			System.out.println("Código inválido (fora da faixa de 1 a 4)");
		
		System.out.println("Informe o combustível de preferência: 1.Álcool 2.Gasolina 3.Diesel 4.Fim");
		escolha = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Álcool:"+alcool);
		System.out.println("Gasolina:"+gasolina);
		System.out.println("Diesel:"+diesel);
		
		sc.close();
	}

}
