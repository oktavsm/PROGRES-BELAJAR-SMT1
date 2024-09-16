package kelaspemdas;
import java.util.*;


public class pemdas0909 {
    
    
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);


        while (true){
        a=input.nextInt();
        System.out.println((a%2==0 && a%3 == 0));
        System.out.println((a%2==0 || a%3==0));
        System.out.println((6) & (5));

        int b = input.nextInt();
        if (b==1){
            continue;
        } else {
            break;
        }
    }
    }


}
