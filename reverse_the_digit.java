import java.util.Scanner;

public class reverse_the_digit {
    public static void main(String[] args) {
        System.out.println("reverse the given digit");

        // String number = "12345" ;
        // String reverse_number = "" ; 

        // for(int i = number.length() - 1; i >=0; i--){
        //     reverse_number += number.charAt(i) ;
        // }
 
        // System.out.println(reverse_number);

    try (Scanner sc = new Scanner(System.in)) {
        String number = sc.nextLine();

         String reverse_number = "" ; 

            for(int i = number.length() - 1; i >=0; i--){
                reverse_number += number.charAt(i) ;
            }

            System.out.println(reverse_number);
    }
    }
}
