package salary.entities;

public class Employee {
	private String name;
	private double grossSalary;
	private double tax;
	
	public Employee() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public double increaseSalary(double percentage) {
		double calcPercente = grossSalary + (grossSalary * percentage / 100);
		return calcPercente - tax;
	}
	
	public String toString() {
		return "Employee: " + name + ", $ " + netSalary();	
	}
}
 