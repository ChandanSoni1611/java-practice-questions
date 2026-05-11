class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }

    void walk() {
        System.out.println("Animal can walk");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class overriding {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.sound();
        obj.walk();
    }
}