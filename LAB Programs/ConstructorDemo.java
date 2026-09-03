//Develop a JAVA program to implement constructor
class Student {
    int rollNo;
    String name;

    // Constructor
    Student() {
        rollNo = 101;
        name = "Rama";
    }

    // Method to display student details
    void display() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
    }
}

public class ConstructorDemo
{
    public static void main(String[] args) {
        // Creating an object
        Student s1 = new Student();

        // Calling display method
        s1.display();
    }
}	