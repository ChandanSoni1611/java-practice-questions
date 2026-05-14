import java.util.Scanner;
public class gcd_or_hcf {
    public static void main(String[] args) {
        System.out.println("finding gcd or hcf of two number");

        // int a = 60 , b = 36 ;
        // int gcd = 1 ;
        // int i ;

        // for(i = 1 ; i <= Math.min(a,b) ; i++){
        //     if(a % i == 0 && b % i == 0)
        //         gcd = i ;
        // }

        // System.out.println(gcd); 

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value for a");
        int a = sc.nextInt();

        System.out.println("enter the value for b");
        int b = sc.nextInt();

        int gcd = 1 ;
        int i ;

        for(i = 1 ; i <= Math.min(a,b) ; i++){
            if(a % i == 0 && b % i == 0)
                gcd = i ;
        }

        System.out.println(gcd); 
    }
}
