package Application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class S12Aula123ExercFix {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();

		System.out.println("Enter file path: ");
		String sourceFileStr = sc.nextLine();

		File sourceFile = new File(sourceFileStr);
		String sourceFolderStr = sourceFile.getParent();

		boolean success = new File(sourceFolderStr + "\\out").mkdir();

		String targetFileStr = sourceFolderStr + "\\out\\summary.csv";

		sc.close();

		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {

			String lineIn = br.readLine();

			while (lineIn != null) {

				String[] vect = lineIn.split(",");

				list.add(new Product(vect[0], Double.parseDouble(vect[1]), Integer.parseInt(vect[2])));

				lineIn = br.readLine();

			}
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

				for (Product strOut : list) {
					bw.write(strOut.getName() + "," + strOut.total());
					bw.newLine();
					bw.flush();
				}

			} catch (IOException e) {
				System.out.println("Erro writing file: " + e.getMessage());
				
			}

		} catch (IOException e) {
			System.out.println("Erro reading file: " + e.getMessage());
		}

	}
}
