import java.util.Scanner;

public class pair_cube_count {
    public static void main(String[] args) {
        System.out.println("count the pair a and b");

        // int n = 28 ;
        // int a ,b ;
        // double cube1 = 0 ;
        // double cube2 = 0 ;
        // int count = 0 ;

        // for(a = 1 ; a <= n ; a++){
        //     for(b = 1 ; b <= n ; b++){
            
        //         cube1 = Math.pow(a, 3);
        //         cube2 = Math.pow(b , 3);

        //         if(cube1 + cube2 == n){
        //             count++ ;
        //         }
        //     }
        // }

        // System.out.println(count);

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println("enter the cube");

        int a ,b ;
        double cube1 = 0 ;
        double cube2 = 0 ;
        int count = 0 ;

        for(a = 1 ; a <= n ; a++){
            for(b = 1 ; b <= n ; b++){
            
                cube1 = Math.pow(a, 3);
                cube2 = Math.pow(b , 3);

                if(cube1 + cube2 == n){
                    count++ ;
                }
            }
        }

        System.out.println(count);

    }
}
