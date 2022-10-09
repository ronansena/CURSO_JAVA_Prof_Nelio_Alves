package course;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class S3Aula50Exerc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student stundent = new Student();

		stundent.name = sc.nextLine();
		stundent.gradeA = sc.nextDouble();
		stundent.gradeB = sc.nextDouble();
		stundent.gradeC = sc.nextDouble();

		System.out.printf("FINAL GRADE: %.2f%n", stundent.finalGrade());
		System.out.println(stundent.passFailed());
		sc.close();
	}

}
