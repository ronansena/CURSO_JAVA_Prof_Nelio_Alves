package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee_2;

public class S5Aula76ExercProposto {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee_2> list = new ArrayList<>();

		System.out.println("How many employee will be registered?");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + ":");
			sc.nextLine();
			System.out.println("Informe o ID:");
			int id = sc.nextInt();
			System.out.println("Informe o nome:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Informe o Salário:");
			double salary = sc.nextDouble();
			list.add(new Employee_2(id, name, salary));
		}

		System.out.println();
		System.out.println("Enter the employee id that will have salary increase :");
		int id = sc.nextInt();

		Employee_2 emp = list.stream().filter(x -> x.getIdemployee() == id).findFirst().orElse(null);

		while (emp == null) {
			System.out.println("This id does not exist!");
			System.out.println();
			System.out.println("Enter the employee id that will have salary increase :");
			int id2 = sc.nextInt();
			emp = list.stream().filter(x -> x.getIdemployee() == id2).findFirst().orElse(null);
		}

		System.out.println("Enter the percentage:");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);

		System.out.println();
		System.out.println("List of employees:\n");
		for (Employee_2 obj3 : list) {
			System.out.println(obj3);

		}

		sc.close();
	}

}
