package kejar;
import java.util.*;
public class kejar_0409 {
    
    

    public static void main(String[] args) {

       Scanner input= new Scanner (System.in);
       String nama;
       int umur;
       float tb,bb;

        nama = input.nextLine();
        umur = input.nextInt();
        tb = input.nextInt();
        bb = input.nextInt();
        

        float bmi = bb/((tb/100)*(tb/100));

        System.out.println("Nama           : "+nama);
        System.out.println("Umur           : "+umur+" tahun");
        System.out.printf("Tinggi Badan   : %.0f cm%n",tb);
        System.out.printf("Berat Badan    : %.0f kg%n",bb);
        System.out.printf("BMI            : %.2f%n",bmi);
        System.out.print("Kategori       : ");
        bmi(bmi);
    }

    public static void bmi (float x){
        if(x<18.5){
            System.out.println("Underweight");
        } else if(x<25){
            System.out.println("Normal");
        } else if (x<30){
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }

}
