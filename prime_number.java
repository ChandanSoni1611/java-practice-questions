
import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        System.out.println("checking number is prime or not");

        // int num = 7 ;

        // if(num <=1){
        //     System.out.println("number is not prime");
        // }

        // boolean isPrime = true;

        // for(int i = 2; i <= Math.sqrt(num); i++){
        //     if(num % i == 0){
        //         isPrime = false;
        //         break;
        //     }
        // }

        // if(isPrime){
        //     System.out.println("nu,mber is prime number");
        // }
        // else{
        //     System.out.println("number is not prime number");
        // }

        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();

            
            if(num <=1){
                System.out.println("number is not prime");
            }

            boolean isPrime = true;

            for(int i = 2; i <= Math.sqrt(num); i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.println("number is prime number");
            }
            else{
                System.out.println("number is not prime number");
            }
        }
    }
}
