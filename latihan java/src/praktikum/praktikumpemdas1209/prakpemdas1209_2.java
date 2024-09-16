package praktikum.praktikumpemdas1209;

import java.util.*;

public class prakpemdas1209_2 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int a,b;
        float hasil;


        System.out.print("Masukkan operator pertama : ");
        a = in.nextInt();
        System.out.print("Masukkan operator kedua : ");
        b = in.nextInt();
        hasil = (float) a/b;
        System.out.println("Hasil penjumlahan: "+(a+b));
        System.out.println("Hasil pengurangan: "+(a-b));
        System.out.println("Hasil perkalian: "+(a*b));
        System.out.println("Hasil pembagian: "+hasil);
        
        in.close();
    }
}
