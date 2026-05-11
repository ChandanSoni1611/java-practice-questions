class Student {
    String name;
    int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Constructor {
    public static void main(String[] args) {

        System.out.println("Constructor Example");

        Student s1 = new Student("John", 20);
        s1.display();
    }
}