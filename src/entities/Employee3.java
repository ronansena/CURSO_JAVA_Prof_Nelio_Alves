package entities;

public class Employee3 {

	public String name;
	public Integer hours;
	public Double valuePerHour;

	public Employee3() {
	}

	public Employee3(String name, Integer hours, Double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public double payment() {
		return valuePerHour * hours;
	}

	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(" - $" + payment());
		return sb.toString();

	}
}
