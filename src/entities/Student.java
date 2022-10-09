package entities;

public class Student {
	
	public String name;
	public double gradeA;
	public double gradeB;
	public double gradeC;
	
	public double finalGrade() {
		return gradeA+gradeB+gradeC;		
	}

	public String passFailed() {
		if (finalGrade() >= 60)
			return  "PASS";
		else
			return  
				"FAILED \n"
				 +"MISSING "
				 + String.format("%.2f",60.00-finalGrade())
				 +" POINTS";
	}
	

}
