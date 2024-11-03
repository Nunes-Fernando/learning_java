package rectangle.entities;

public class Rectangle {
	
	private double width;
	private double height;
	
	public Rectangle() {
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double area() {
		return width * height;
	}
	
	public double diagonal() {
		return 2 * (width + height);
	}
	
	public double perimeter() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	
	public String toString() {
		return "AREA = " + area() + "\n" +
		"DIAGONAL = " + diagonal() + "\n" +
		"PERIMETER = " + perimeter();
	}
}
