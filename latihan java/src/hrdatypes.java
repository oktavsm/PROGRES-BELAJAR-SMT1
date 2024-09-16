import java.util.*;


public class hrdatypes {

    
    public static void main (String[] args){
        Scanner input= new Scanner(System.in);
        long x;
        int n;
        n= input.nextInt();

        for (int i=1 ; i<=n;i++){
            
            try{
                x= input.nextLong();
            if((x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE)) {
                System.out.println(x+" can be fitted in:\n* byte \n* short\n* int\n* long");
            }
            else if((x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)) {
                System.out.println(x+" can be fitted in:\n* short\n* int\n* long");
            }else if((x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)) {
                System.out.println(x+" can be fitted in:\n* int\n* long");
            }else if((x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)) {
                System.out.println(x+" can be fitted in:\n* long");
            } 
        } catch(Exception e){
            System.out.println(input.next()+" can't be fitted anywhere.");
        }


        }



    }




}
