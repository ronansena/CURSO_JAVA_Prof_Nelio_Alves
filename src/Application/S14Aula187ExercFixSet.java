package Application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.StudentSecao14;

public class S14Aula187ExercFixSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many students for course A?");
		int countA = sc.nextInt();
		
		Set<StudentSecao14> setA = new HashSet<>();
		Set<StudentSecao14> setB = new HashSet<>();
		Set<StudentSecao14> setC = new HashSet<>();
		
		for(int i = 1; i<=countA ;i++) {	
			int codStudent =sc.nextInt();
			setA.add(new StudentSecao14(codStudent, "A"));					
		}
		
		System.out.println("How many students for course B?");
		int countB = sc.nextInt();	
		
		for(int i = 1; i<=countB ;i++) {			
			int codStudent =sc.nextInt();
			setB.add(new StudentSecao14(codStudent, "B"));						
		}
		
		System.out.println("How many students for course C?");
		int countC = sc.nextInt();
		
		
		for(int i = 1; i<=countC ;i++) {			
			int codStudent =sc.nextInt();
			setC.add(new StudentSecao14(codStudent, "C"));					
		}			
			
			Set<StudentSecao14> total = new HashSet<>(setA);			
			total.addAll(setB);
			total.addAll(setC);
			
			System.out.println("Total students:"+ total.size());	
			
			for (StudentSecao14 student : setA) {
				System.out.println(student.getCourse()+" - "+student.getCodStudent());
			}
			for (StudentSecao14 student : setB) {
				System.out.println(student.getCourse()+" - "+student.getCodStudent());
			}
			for (StudentSecao14 student : setC) {
				System.out.println(student.getCourse()+" - "+student.getCodStudent());
			}
		sc.close();

	}

}
