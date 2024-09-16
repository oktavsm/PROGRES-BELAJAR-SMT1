package kelaspemdas;
import java.util.*;
public class pemdas1309 {
    public static void main(String[] args) {
        
        
        double a =  (Math.random() * 100)+1;
        int x = (int) a;
        Scanner in = new Scanner(System.in);
        int y;
        while (true){
            
            System.out.print("Masukkan bilangan dengan rentang 1-100 untuk menebak Mystery Number : ");
            y=in.nextInt();

            if(y==x){
                System.out.println("Benar, Mystery Numbernya adalah : " + x);
                break;
            } else if (y>x){
                System.out.println(y+" lebih besar dari Mistery Number");
            } else {
                System.out.println(y+" lebih kecil dari Mystery Number");
            }
        
            
        }
        in.close();
    }
}
