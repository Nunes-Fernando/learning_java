package salary.application;

import java.util.Scanner;

import salary.entities.Employee;

public class Application {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		emp.setName(sc.nextLine());
		emp.setGrossSalary(sc.nextDouble());
		emp.setTax(sc.nextDouble());
		
		System.out.println("Which percentage to increase salary ? ");
		
		double percentage = sc.nextDouble();
		
		
		System.out.println(emp);
		System.out.println("Update data: " + emp.getName() + ", $ " + emp.increaseSalary(percentage));
		
	}
}
