package phase_1_project_assessment2;


class Shape {
	//Encapsulated fields
	private String color;

	//Constructor
	public Shape(String color) {
	this.color = color;
	}

	//Encapsulation: Getter and Setter for color
	public String getColor() {
	return color;
	}

	public void setColor(String color) {
	this.color = color;
	}

	//Abstraction: Method to calculate area (to be implemented by subclasses)
	public double calculateArea() {
	return 0.0;
	}

	//Polymorphism: Method to display shape information
	public void displayInfo() {
	System.out.println("Shape - Color: " + color);
	}
	}

	//Example of a subclass inheriting from the Shape class
	class Circle extends Shape {
	private double radius;

	public Circle(String color, double radius) {
	super(color);
	this.radius = radius;
	}

	//Inheritance and Polymorphism: Override calculateArea() and displayInfo() methods
	@Override
	public double calculateArea() {
	return Math.PI * radius * radius;
	}

	@Override
	public void displayInfo() {
	System.out.println("Circle - Color: " + getColor() + "\n Radius: " + radius + ", Area: " + calculateArea());
	}
	}

	
public class Pillers {
	public static void main(String[] args) {
		 // Create objects of Shape and Circle classes
		 Shape shape = new Shape("Red");
		 Circle circle = new Circle("Blue", 8.0);

		 // Accessing class members through objects
		 shape.setColor("Pink");
		 System.out.println("Shape color: " + shape.getColor());
		 shape.displayInfo();

		 circle.setColor("LIGHT BLUE");
		 System.out.println("Circle color: " + circle.getColor());
		 circle.displayInfo();

	}


}
