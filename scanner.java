import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            String myString = scanner.nextLine();
            int myInt = scanner.nextInt();

            System.out.println("myString is: " + myString);
            System.out.println("myInt is: " + myInt);
        }
    }
}