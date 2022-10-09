package Application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee4;

public class S15Aula202ExercFix {

	public static void main(String[] args) throws IOException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		

		System.out.println("Enter file full path:");
		String path = sc.next();
		System.out.println("Enter salary:");
		double salaryUserInfor = sc.nextDouble();

		try {
			BufferedReader br = new BufferedReader(new FileReader(path));

			String line = br.readLine();
			List<Employee4> list = new ArrayList<>();

			while (line != null) {

				String[] fields = line.split(",");
				String name = fields[0];
				String email = fields[1];
				double salary = Double.parseDouble(fields[2]);
				list.add(new Employee4(name, email, salary));
				line = br.readLine();
			}

			System.out.println("Email of people whose salary is more than " + String.format("%.2f", salaryUserInfor) + ": ");

			List<String> emailSalaryAbove = list.stream()
					.filter(x -> x.getSalary() > salaryUserInfor)
					.map(e -> e.getEmail())
					.sorted((e1, e2) -> e1.toUpperCase().compareTo(e2.toUpperCase()))
					.collect(Collectors.toList());

			emailSalaryAbove.forEach(System.out::println);

			double sumSalary = list.stream()
					.filter(x -> x.getEmail().toUpperCase().charAt(0) == 'M')
					.map(x -> x.getSalary())
					.reduce(0.0, Double::sum);
			// também funciona desta forma .reduce(0.0,(x,y) -> x+y);

			System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sumSalary));

			br.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sc.close();

	}

}
