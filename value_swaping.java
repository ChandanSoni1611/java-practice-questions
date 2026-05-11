// public class value_swaping {
//     public static void main(String[] args) {
//         System.out.println("swap the two value using 3rd variable");
    
//         int a = 10 ;
//         int b = 5 ;

//         System.out.println("Before swap:");
//         System.out.println("a = " + a + ", b = " + b);

//         int temp = a;
//         a = b;
//         b = temp;

//         // swapping logic

//         System.out.println("After swap:");
//         System.out.println("a = " + a + ", b = " + b);
//     }
// }

import java.util.Scanner;
public class value_swaping {
    public static void main(String[] args) {
        System.out.println("swap the two value using 3rd variable");

        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();

        
        
        System.out.println("Before swap:");
        System.out.println("a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        // swapping logic

        System.out.println("After swap:");
        System.out.println("a = " + a + ", b = " + b);
        }
    }
}
