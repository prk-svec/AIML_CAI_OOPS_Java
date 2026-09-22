//4.b Develop a JAVA program to implement multi
// level Inheritance.
class Person {
    String name = "Ravi";

    void displayPerson() {
        System.out.println("Name       : " + name);
    }
}

class Student extends Person {
    int rollNo = 101;

    void displayStudent() {
        System.out.println("Roll No    : " + rollNo);
    }
}

class EngineeringStudent extends Student {
    String branch = "CSE";

    void displayEngineeringStudent() {
        System.out.println("Branch     : " + branch);
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {

        EngineeringStudent es = new EngineeringStudent();

        es.displayPerson();
        es.displayStudent();
        es.displayEngineeringStudent();
    }
}