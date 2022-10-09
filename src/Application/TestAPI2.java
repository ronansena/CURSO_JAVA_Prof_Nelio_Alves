package Application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestAPI2 {

	    public static void main(String[] args) throws IOException {
	    	
	    	Process result = Runtime.getRuntime().exec("C:\\\\\\\\KMPlayer\\\\\\\\KMPlayer.exe");
	       	    	
	        BufferedReader output = new BufferedReader(new InputStreamReader(result.getInputStream()));
	        StringBuffer outputSB = new StringBuffer(40);
	        String s = null;

	        while ((s = output.readLine()) != null) {
	            outputSB.append(s + "\n");
	            System.out.println(s);
	        }

	       String result1 = output.toString();
	        System.out.println(result1);
	    }
	    
	 

}
