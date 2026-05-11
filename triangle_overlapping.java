public class triangle_overlapping {
    public static void main(String[] args) {
        System.out.println("trinagle is overlapping or not");

        // t = top , b = bottom , e = edge ;

        // triangle 1 
 
        int te1x = 5 , te1y = 10 ;
        int ble1x = 0 , ble1y = 5 ;
        int bre1x = 10 , bre1y = 5 ;

        // triangle 2 

        int te2x = 20 , te2y = 5 ;
        int ble2x = 15 , ble2y = 0 ;
        int bre2x = 25 , bre2y = 0 ;

        // for comparing triangle is not overlapping side by side 

        if (bre1x < ble2x || bre2x < ble1x) {
            System.out.println("triangle not overlap");
        }
        else if (te1y < ble2y || te2y < ble1y) {
            System.out.println("triangle not overlap");
        }
        else{
            System.out.println("triangle overlap");
        }
    }
}
