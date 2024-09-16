import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int x,y;

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Sekarang hari ke berapa?(1-7) : ");
            x= input.nextInt();
            if (x<0 || x>7) {
                System.out.println("HARI CUMAN 1-7 :(");
                continue;
            }
            System.out.print("Kamu ingin ketemu berapa hari lagi? : ");
            y =input.nextInt();

            int hasil= (x+y)%7;

            if (hasil==1){
                System.out.println("Kamu akan bertemu di hari senin");
            } else if (hasil==2){
                System.out.println("Kamu akan bertemu di hari selasa");
            } else if (hasil==3){
                System.out.println("Kamu akan bertemu di hari rabu");
            } else if (hasil==4){
                System.out.println("Kamu akan bertemu di hari kamis");
            } else if (hasil==5){
                System.out.println("Kamu akan bertemu di hari jumat");
            } else if (hasil==6){
                System.out.println("Kamu akan bertemu di hari sabtu");
            } else if (hasil==0){
                System.out.println("Kamu akan bertemu di hari minggu");
            } 

            int i;
            System.out.print("Lanjut? (1/2) : ");
            i= input.nextInt();
            
            if (i==1){
                continue;
            } else {
                break;
            }
        }
    }
}
