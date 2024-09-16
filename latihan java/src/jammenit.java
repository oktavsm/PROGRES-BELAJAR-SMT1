
import java.util.*;
public class jammenit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[] = new int[2];
        int b[] = new int[2];
        int jam[] = new int [2];
        int sum[] = new int [2];

        String bulan;
        System.out.print("Jadwal bulan apa? : ");
        bulan = in.nextLine();
        while (true) {
            System.out.println("\n========================Masukan jadwal========================");
            System.out.print("Mulai jam berapa (jam (spasi) menit) : ");
            a[0] = in.nextInt();
            a[1] = in.nextInt();

            System.out.print("sampai jam berapa (jam (spasi) menit) : ");
            b[0] = in.nextInt();
            b[1] = in.nextInt();

            jam=konversi(a, b);
            sum[0]+=jam[0];
            sum[1]+=jam[1];

            if (sum[1]>=60){
                sum[0]++;
                sum[1]%=60;
            }
            int ok;
            System.out.print("ADA LAGI?(1 UNTUK YA) : ");
            ok = in.nextInt();
            if (ok!=1) {
                break;
            }


        }

        print(sum, bulan);


        in.close();

      
    }

    public static int[] konversi(int[] x, int y[]){
        int[] hasil = new int[2];

        hasil[0]=y[0]-x[0];

        if(y[1]<x[1]){
            hasil[0]--;
            y[1]+=60;
            hasil[1]=y[1]-x[1];
        } else {
            hasil[1]=y[1]-x[1];
        }

        return hasil;
    }
    public static void print (int [] x, String y){
        System.out.println("===========================================================");
        System.out.printf("Total jam bulan %s adalah : %d jam %d menit\n",y,x[0],x[1]);
        float z = (float) x[0]*7500;
        if(x[1]>0){
            z+=  (((float) x[1]/60) * 7500);
        
        System.out.printf("PLD bulan %s adalah : Rp %.2f",y,z);
    }
    }
}
