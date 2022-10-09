package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pensao;


public class S5Aula71 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("How many rooms will be rented?");
		int quantRoom = sc.nextInt();
		Pensao[] vect = new Pensao[10];
		
		for (int i=1;i<=quantRoom;i++) {
			sc.nextLine();
			System.out.println("Rent #"+i);
			System.out.println("Digite o seu nome:");
			String nome = sc.nextLine();
			System.out.println("Digite o seu email:");
			String email = sc.nextLine();
			System.out.println("Digite o número do quarto desejado entre 0 e 9:");
			int numberRoom = sc.nextInt();
			
			vect[numberRoom] = new Pensao(nome,email);			
		}
		System.out.println("Busy rooms:\n");
		for (int i=0;i<=9;i++) {
			if(vect[i]!= null)
			System.out.println(i+": "+ vect[i].getNome()+", "+vect[i].getEmail()+"");
		}	
		sc.close();
		
	}

}
