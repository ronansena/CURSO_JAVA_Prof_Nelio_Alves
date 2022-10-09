package Application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class S14Aula189ExercFixSet {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter file full path:");
		String path = sc.next();
			
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
		
			String line = br.readLine();
			
			Map<String,Integer> election = new LinkedHashMap<String,Integer>();
		
			while(line != null) {	
				
				String[] dataPoll = line.split(",");
				String candidate = dataPoll[0];
				Integer votes = Integer.parseInt(dataPoll[1]);		
			
				if (election.containsKey(candidate)) {	
					int votesTotal = election.get(candidate);
					election.put(candidate, votes + votesTotal);
				}
				else {
					election.put(candidate, votes);	
				}
				line = br.readLine();						
			}
			br.close();
			
			for (String key : election.keySet()) {
				System.out.println(key + ": " + election.get(key));
				}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		sc.close();
		
	}

}
