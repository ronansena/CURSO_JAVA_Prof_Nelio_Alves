package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee3;
import entities.OutsourcedEmployee;

public class S9Aula108ExecR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee3> list = new ArrayList<>();

		int q = 0;

		System.out.println("Enter the number of employees:");
		q = sc.nextInt();

		for (int i = 1; i <= q; i++) {

			System.out.println("Employee #" + i + " data:");
			System.out.println("Outsourced (y/n)?");
			char choose = sc.next().charAt(0);

			System.out.println("Name:");
			String name = sc.next();
			System.out.println("Hours:");
			int hours = sc.nextInt();
			System.out.println("Value per hour:");
			double valPerHours = sc.nextDouble();

			

			if (choose == 'y') {
				System.out.println("Additional charge:");
				double additionalCharge = sc.nextDouble();
				Employee3 emp = new OutsourcedEmployee(name, hours, valPerHours, additionalCharge);
				list.add(emp);
			} else {
				Employee3 emp = new Employee3(name, hours, valPerHours);
				list.add(emp);
			}	
	
		}
		
			System.out.println("PAYMENTS: \n ");
			for(Employee3 imp : list) {
				System.out.println(imp);	
			}			
		sc.close();
	}

}
