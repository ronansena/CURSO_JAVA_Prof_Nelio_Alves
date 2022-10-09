package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities_enums.OrderStatus;

public class S9Aula100ExercFix {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		OrderItem orderIt = null; 
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter cliente data:");
		System.out.println("Name:");		
		String name = sc.nextLine();
		System.out.println("Email:");
		String email = sc.next();
		System.out.println("Birth date (DD/MM/YYYY):");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name,email,birthDate);
		
		System.out.println("Enter order data:");
		System.out.println("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		System.out.println("How many items to this order?");
	
				
		Order order = new Order(new Date(), status, client);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Enter #"+i+" item data:");
			System.out.println("Product name:");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.println("Product price:");
			double productPrice = sc.nextDouble();
			
			Product product = new Product(productName,productPrice);
			
			System.out.println("Quantity:");
			int quantity = sc.nextInt();
		
			orderIt = new OrderItem(quantity,product.getPrice(),product);
			
			order.addItem(orderIt);
		}		
		
		System.out.println();
		System.out.println(order);
		
		sc.close();
	}

}
