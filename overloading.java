// class MathDemo {

//     void add(int a, int b) {
//         System.out.println("Sum of 2 numbers: " + (a + b));
//     }

//     void add(int a, int b, int c) {
//         System.out.println("Sum of 3 numbers: " + (a + b + c));
//     }
// }

// public class overload {
//     public static void main(String[] args) {
//         MathDemo obj = new MathDemo();

//         obj.add(10, 20);
//         obj.add(10, 20, 30);
//     }
// }

public class overloading {

    void add(int a, int b) {
        System.out.println("Sum of 2 numbers: " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum of 3 numbers: " + (a + b + c));
    }

    public static void main(String[] args) {
        overloading obj = new overloading();

        obj.add(10, 20);
        obj.add(10, 20, 30);
    }
}