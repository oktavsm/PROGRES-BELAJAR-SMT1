package praktikum.praktikumpemdas1209;


import java.util.*;
public class prakpemdas1209 {
    public static void main(String[] args) {     
        Scanner in = new Scanner(System.in);
        
        String nm,kel;
        int awl,akr,biaya;
        float ppj;

        
        System.out.print("Masukkan Nama: ");
        nm = in.nextLine();
        System.out.print("Kelurahan: ");
        kel = in.nextLine();
        System.out.print("Masukkan posisi awal Kwh Meter: ");
        awl = in.nextInt();
        System.out.print("Masukkan posisi akhir Khw Meter: ");
        akr = in.nextInt();
        System.out.print("Masukkan biaya beban saat ini: ");
        biaya = in.nextInt();
        System.out.print("Masukkan PPJ (dalam persen): ");
        ppj = in.nextFloat()/100;
        int pemakaian,tarif;
        float ppj10,total;
        pemakaian= (akr-awl);
        tarif = (biaya*pemakaian);
        ppj10 = ppj*tarif;
        total= ppj10+tarif;
        System.out.println("\n\n===================PLN Java===================");
        System.out.println("Nama:"+nm);
        System.out.println("Kelurahan:"+kel);
        System.out.println("Pemakaian bulan ini: "+pemakaian+" Kwh Meter");
        System.out.println("Tarif Listrik: Rp "+tarif+",-");
        System.out.printf("PPJ 10%%: Rp %.0f,-%n",ppj10);
        System.out.printf("Total Bayar: Rp %.0f,-",total);
        System.out.println("\n==============================================");
//      Oktavianus Samuel Minarto - 245150200111043
        in.close();    
    }
    }
    