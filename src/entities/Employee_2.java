package entities;

public class Employee_2 {

	private Integer idemployee;
	private String nome;
	private Double salary;

	public Employee_2(Integer idemployee, String nome, Double salary) {

		this.idemployee = idemployee;
		this.nome = nome;
		this.salary = salary;
	}

	public Integer getIdemployee() {
		return idemployee;
	}

	public void setIdemployee(Integer idemployee) {
		this.idemployee = idemployee;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public Double increaseSalary(double percentage) {
		return salary += salary*percentage/100;
	}
	
	
	public String toString() {
		return 
				idemployee
				+", "
				+nome
				+", "
				+salary;
					
	}

}
