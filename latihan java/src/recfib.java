import java.util.*;



public class recfib {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x;
        
        while (true) {
        x=input.nextInt();

        System.out.println("Bilang ke " + x +  "dalam deret fibonacci adalah : " + fib(x));
        }
    }


    static int fib (int i){

        if (i==1 || i==0){
         return i;  
        }


        return fib(i-1) + fib (i-2);
        
    }


}
