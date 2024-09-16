import java.util.*;

public class ketemuan {


public static void main(String[] args) {
 int a,b,c;
 
 Scanner input = new Scanner(System.in);

 while (true) {
    System.out.print("Sekarang hari apa?(1-7) : ");
    a=input.nextInt();
    if (a<0 || a>7) {
        System.out.println("Hari cuman ada 1-7!! Ulanggggggggg");
        continue;
    }
    System.out.print("Mau ketemuan berapa hari lagi? : ");
    b=input.nextInt();
    System.out.println("\n");

    hari(a,b);

    System.out.print("\n\n\nLagi?(1. Ya, 2. Gak) : ");
    c=input.nextInt();

  

    if (c==1) {
        continue;
    } else if (c==2) {
        break;
    } else {
        System.out.println("Batu '-' ");
        continue;
    }
 }


}
    static void hari (int i, int j){
        int k = (i + j) % 7;

        if (k==1){
            System.out.print("Kamu akan ketemuan di hari senin ");
            minggu(j);
        } else if (k==2){
            System.out.print("Kamu akan ketemuan di hari selasa ");
            minggu(j);
        } else if (k==3){
            System.out.print("Kamu akan ketemuan di hari rabu ");
            minggu(j);
        } else if (k==4){
            System.out.print("Kamu akan ketemuan di hari kamis ");
            minggu(j);
        } else if (k==5){
            System.out.print("Kamu akan ketemuan di hari jumat ");
            minggu(j);
        } else if (k==6){
            System.out.print("Kamu akan ketemuan di hari sabtu ");
            minggu(j);
        } else if (k==0){
            System.out.print("Kamu akan ketemuan di hari minggu ");
            minggu(j);
        }
    }

    static void minggu (int x) {
        if (x/7==1){
            System.out.println(" minggu depan");
        } else if(x/7>1){
            System.out.println(x/7 + " minggu lagi");
        } else {
            System.out.println(x + " hari lagi");
        }
    }
}