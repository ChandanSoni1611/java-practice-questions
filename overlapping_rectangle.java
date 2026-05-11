public class overlapping_rectangle {
    public static void main(String[] args) {
        System.out.println("to find reactangle is overlap or not");

        //Reactangle 1

        int tl1x = 0 , tl1y = 10 ;
        int br1x = 10, br1y = 0 ;

        //Reactangle 2 

        int tl2x = 5 , tl2y = 5 ;
        int br2x = 15, br2y = 0 ;

        //for comparing reactangle are overlap side by side or not

        if(br1x < tl2x || br2x < tl1x){
            System.out.println("no overlap");
        }
        else if(br1y > tl2y || br2y > tl1y){
            System.out.println("no overlap");
        }
        else{
            System.out.println("overlap");
        }
    }
}
