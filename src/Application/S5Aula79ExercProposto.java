package Application;

import java.util.Locale;
import java.util.Scanner;

public class S5Aula79ExercProposto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de linhas");
		int x = sc.nextInt();
		System.out.println("Digite a quantidade de colunas");
		int y = sc.nextInt();

		int[][] mat = new int[x][y];

		for (int l = 0; l < x; l++) {
			for (int c = 0; c < y; c++) {
				mat[l][c] = sc.nextInt();
			}
		}
		System.out.println("Digite o número para ser buscado na matriz:");
		int z = sc.nextInt();

		for (int l = 0; l < mat.length; l++) {
			for (int c = 0; c < mat[l].length; c++) {
				if (mat[l][c] ==z) {
					System.out.println("Position "+l+","+c+":");
					if(c>0) {
					System.out.println("Left: "+mat[l][c-1]);
					}
					if(c < mat[l].length-1) {
					System.out.println("Right: "+mat[l][c+1]);
					}
					if(l>0) {
					System.out.println("Up: "+mat[l-1][c]);
					}
					if(l< mat.length-1) {
					System.out.println("Down:"+mat[l+1][c]);	
					}
				}
			}
		}
		sc.close();
	}
}
