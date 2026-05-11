import java.util.Scanner;

public class dice_faces_problem {
    public static void main(String[] args) {
        System.out.println("guessing the number on opposite side of dice face");

        // int num = 1;

        // if(num == 1)
        //     System.out.println("6");
        // else if(num == 2)
        //     System.out.println("5");
        // else if(num == 3)
        //     System.out.println("4");
        // else if(num == 4)
        //     System.out.println("3");
        // else if(num == 5)
        //     System.out.println("2");
        // else
        //     System.out.println("1");

        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();

            switch (num) {
                case 1 -> System.out.println("6");
                case 2 -> System.out.println("5");
                case 3 -> System.out.println("4");
                case 4 -> System.out.println("3");
                case 5 -> System.out.println("2");
                case 6 -> System.out.println("1");
                default -> System.out.println("Enter the number from 1 - 6");
            }
        }
    }
}
