package kelaspemdas;
import java.util.*;

public class pemdas_2_09 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
       while (true){
        System.out.println("WAKTU SEKARANG");
        System.out.print("GMT+ berapa ? : ");
        long x;
        x=input.nextInt();
        waktu(x);

        int y;
        System.out.print("Lagi? (1/2): ");
        y=input.nextInt();

        if (y==1) {
            continue;
        } else {
            break;
        }

       }
        
    }

    public static void waktu ( long i){

        long x=System.currentTimeMillis()/1000;
        long sec = x % 60;
        long min = x / 60 % 60;
        long hour = (x /60/60%24)+i;

        System.out.println(hour + ":" + min+":"+sec);
    }



}