//Develop a JAVA program to implement method overloading.
class MethodOverloading {

	int l = 10, b = 20;

	int area() {
		return l * b;
	}

	int area(int l, int b) {
		return l * b;
	}
}

public class MethodOverloadingDemo{
	
	public static void main(String args[]) {
		
		MethodOverloading a1 = new MethodOverloading();
		int r1 = a1.area();
		System.out.println("The area is: " + r1);
		
		int r2 = a1.area(5, 20);
		System.out.println("The area is:	" + r2);
	}

}
