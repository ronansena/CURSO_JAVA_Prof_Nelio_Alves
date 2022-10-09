package course;

import java.util.Scanner;

public class S2Aula24Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int timeNow; 
		
		System.out.println("What time is it?");
		
		timeNow = sc.nextInt();
		
		if(timeNow < 12) {
			System.out.println("Good morning!");
		}
		else if (timeNow < 18) {
			System.out.println("Good afternoon!");
		}
		else 
			System.out.println("Good evening!");
		
		sc.close();

	}

}
