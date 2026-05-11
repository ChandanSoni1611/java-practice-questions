class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        System.out.println("Default constructor called");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Default_Constructor {
        public static void main(String[] args) {

        Student s1 = new Student();   // default constructor runs

        s1.name = "Rahul";           // set values later
        s1.age = 18;

        s1.display();
    }
}
