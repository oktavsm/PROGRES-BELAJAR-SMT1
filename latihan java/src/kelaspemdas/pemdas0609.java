package kelaspemdas;
import java.util.*;



public class pemdas0609 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        while (true) {
            System.out.print("1/2 : ");
            n=in.nextInt();

            if (n==1) {
                int x = (int) (Math.random()*6)+1;
                System.out.println("Dadu : "+x);
            } else {
                break;
            }
            
        }
    }
}
