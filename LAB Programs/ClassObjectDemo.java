//Develop a JAVA program to implement class Mechanism.
 //Build a class, methods and invoke them inside main method.
class Dog {
    String breed;
    int age;
    String color;

    public void setBreed(String b) {
        breed = b;
    }

    public void setAge(int a) {
        age = a;
    }

    public void setColor(String c) {
        color = c;
    }

    public void printDetails() {
        System.out.println("Dog details: ");
        System.out.println("Breed: "+breed);
        System.out.println("Age: "+age);
        System.out.println("Color: "+color);
    }
}

public class ClassObjectDemo {
    public static void main(String[] args) {

        Dog obj = new Dog();

        obj.setBreed("Golden Retriever");
        obj.setAge(2);
        obj.setColor("Gold");

        // Printing values
        obj.printDetails();
    }
}