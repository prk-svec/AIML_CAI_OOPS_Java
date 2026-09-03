//Develop a JAVA program to implement constructor overloading
class ConstructorOverloading {

	int l, b;

	ConstructorOverloading() {
		l = 10;
		b = 20;
	}

	ConstructorOverloading(int u, int v) {
		l = u;
		b = v;
	}

	int area() {
		return l * b;
	}
}

public class ConstructorOverloadingDemo {
	
	public static void main(String args[]) {
		
	ConstructorOverloading a1 = new ConstructorOverloading();
	int r1 = a1.area();
	System.out.println("The area is: " + r1);
		
	ConstructorOverloading a2 = new ConstructorOverloading(30, 40);
	int r2 = a2.area();
	System.out.println("The area is:	" + r2);
	}
}
