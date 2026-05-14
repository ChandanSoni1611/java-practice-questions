import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        System.out.println("finding the lcm of a number");

        // int a = 12 , b = 18 ;
        // int max = Math.max(a,b) ; 

        // while(true){

        //     if(max % a == 0 && max % b == 0){
        //         System.out.println("LCM is: " + max); 
        //         break ;
        //     }

        //     max++ ; 

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number for variable a");
        int a = sc.nextInt();

        System.out.println("enter the number for variable b");
        int b = sc.nextInt();

        int max = Math.max(a,b) ; 

        while(true){

            if(max % a == 0 && max % b == 0){
                System.out.println("LCM is: " + max);
                break ;
            }

            max++ ; 
        }
    }
}
