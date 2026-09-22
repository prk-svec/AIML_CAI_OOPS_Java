// 4.c Develop a JAVA program for abstract class 
//to find areas of different shapes.

// Abstract class Shape
abstract class Shape {
    // Abstract method to calculate area
    abstract double calculateArea();
}

// Subclass for Circle
class Circle extends Shape {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Implement calculateArea for Circle
    double calculateArea() {
        return 3.14 * radius * radius;
    }
}
// Subclass for Rectangle
class Rectangle extends Shape {
    double length, width;
    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implement calculateArea for Rectangle
    double calculateArea() {
        return length * width;
    }
}

// Subclass for Triangle
class Triangle extends Shape 
{
	double base,height;
    // Constructor
	Triangle(double base, double height)
	{
		this.base = base;
		this.height = height;
	}
    // Implement calculateArea for Triangle
	double calculateArea()
	{
		return 0.5*base*height;
	}
}
// Main class
public class Areas {
    public static void main(String[] args) {
        // Create objects of each shape
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 7);
        Shape triangle = new Triangle(6, 8);

        // Calculate and print the area of each shape
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}
