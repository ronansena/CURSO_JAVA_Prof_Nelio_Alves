package Application;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class TestAPIExplorer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Process p = new ProcessBuilder("explorer.exe", "/select,D:\\KMPlayer\\KMPlayer.exe").start();
		/*
		 try {
		   Process p = Runtime.getRuntime().exec("cmd /c start C:\\\\KMPlayer\\\\KMPlayer.exe");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		*/
		try {
		    Desktop.getDesktop().open(new File("D:\\.mp4"));
		    //Desktop.getDesktop().open(new File("C:\\Users\\ronan\\Downloads\\.mp4"));
		    //File p = new File("D:\\.mp4");
		    //Desktop.getDesktop().moveToTrash(p);
		    		    
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
	

}
