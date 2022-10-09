package entities;

public class Retangulo {

	public double width,height;
	
	public double areaCalculada() {
		return width * height; 		
	}
	
	public double perimetroCalculado() {
		return 2*(width+height); 		
	}
	
	public double diagonalCalculada() {		 ; 
		return Math.sqrt((width*width)+(height*height));
	}
}