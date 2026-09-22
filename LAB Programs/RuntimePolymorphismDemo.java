// week 5
// 5.c Develop a JAVA program that implements Runtime polymorphism - method overriding
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class RuntimePolymorphismDemo {
    public static void main(String[] args) {

        Animal a;   // Superclass reference

        a = new Dog();   // Dog object
        a.sound();       // Dog's sound() is called

        a = new Cat();   // Cat object
        a.sound();       // Cat's sound() is called
    }
}