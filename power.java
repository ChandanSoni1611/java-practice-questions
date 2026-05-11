import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        System.out.println("checking the power of x is equal to y or not");

        // int x = 2;
        // int y = 8;
       
        // while(y % x == 0){
        //     y = y / x ;
        // }

        // if(y == 1){
        //     System.out.println(y + " is a power of " + x);
        // }
        // else{
        //     System.out.println(y + " is not a power of " + x);
        // }

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the x value");
            int x = sc.nextInt();

            System.out.println("Enter the y value");
            int y = sc.nextInt();

            while(y % x == 0){
                y = y / x ;
            }

            if(y == 1){
                System.out.println(y + " is a power of " + x);
            }
            else{
                System.out.println(y + " is not a power of " + x);
            }
        }
    }
}
