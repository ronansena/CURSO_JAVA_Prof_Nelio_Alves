package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportProduct;
import entities.Product;
import entities.UsedProduct;

public class S9Aula110Exerc {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter the number of products:");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println("Product #"+i+" data:");	
			System.out.println("Common, used or imported (c/u/i)?");
			char typeProduct;
			typeProduct = sc.next().charAt(0);
			System.out.println("Name:");
			String name = sc.next();
			System.out.println("Price:");
			double price = sc.nextDouble();
			
			
			if(typeProduct == 'c' ) {
				Product prod = new Product(name,price);
				list.add(prod);
			}
			else if(typeProduct == 'u') {
				System.out.println("Manufacture date (DD/MM/YYYY):");
				Date manufacture = sdf.parse(sc.next());
				Product prod = new UsedProduct(name,price,manufacture);
				list.add(prod);
			}
			else {
				System.out.println("Customs fee: ");
				double customFee = sc.nextDouble();
				Product prod = new ImportProduct(name,price,customFee);
				list.add(prod);
			}
		}
		
		System.out.println("PRICE TAGS:");	
		
		for(Product imp :list) {
			System.out.print(imp.priceTag());
		}
		
		sc.close();	
	}
}
