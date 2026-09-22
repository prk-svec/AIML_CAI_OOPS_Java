//4a. Develop a JAVA program to implement 
//Single Inheritance.

// Super class (Parent class)
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
// Derived class (Child class)
class Student extends Person {
    String course;
    Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }
    void showDetails() {
        super.showDetails();
        System.out.println("Course: " + course);
    }
}
// Main class
public class SingleInheritance {
    public static void main(String[] args) {
        Student student = new Student("Ramu", 20, "CSE");
        student.showDetails();
    }
}

