package course;

import java.util.Scanner;

public class S2Aula36Exerc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a senha:");
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha inválida!");
			System.out.println("Digite a senha:");
			senha = sc.nextInt();
		}
		System.out.println("Acesso Permitido!");
		sc.close();
	}

}
