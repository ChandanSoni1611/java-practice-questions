import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        System.out.println("checking the number is even or odd");

        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            
            if (num % 2 == 0) {
                System.out.println("even number");
            } else {
                System.out.println("odd number");
            }
        }
    }
}