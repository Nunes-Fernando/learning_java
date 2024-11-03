package rectangle.application;

import java.util.Scanner;

import rectangle.entities.Rectangle;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		rectangle.setWidth(sc.nextDouble());
		rectangle.setHeight(sc.nextDouble());
		
		System.out.println(rectangle);
		
	}
}
