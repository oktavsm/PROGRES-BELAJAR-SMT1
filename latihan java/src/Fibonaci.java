import java.util.*;


public class Fibonaci {
    public static void main(String [] args){


        int i,f1,f2,fn,n;
        Scanner input= new Scanner(System.in);
        f1=0;
        f2=1;

        n= input.nextInt();
        i=1;
        while (i<n){

            fn= f1+f2;
            f1=f2;
            f2=fn;
            i++;
            System.out.println(fn);
        }

        
    }
}
