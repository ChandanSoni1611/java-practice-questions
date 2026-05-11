class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }

    void walk() {
        System.out.println("Animal can walk");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("DOg barks");
    }
}

public class inheritance {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.sound();
        obj.walk();
    }
}