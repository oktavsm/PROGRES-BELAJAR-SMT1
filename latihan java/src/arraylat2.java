import java.util.*;
//Arrays.copyOf(nama array, panjang array) mengcopy array
//Arrays.toString
//Arrays.copyOfRange(nama array, panjang x, sampai panjang y) mengcopy array dari rentang tertentu
//Arrays.fill(nama array, nilai yg ingin di fill) mengisi nilai array dengan sebuah nilai yang sama
//Arrays.equals membandingkan dua buah array sama persis atau tidak
//Arrays.compare membandingkan array mana yang lebi besar 
//Arrays.mismatch()
//Arrays.binnarySearch()
//Arrays.sort


public class arraylat2 {
    public static void main(String[] args) {
        Scanner in= new Scanner (System.in);
        char a;
        a = in.next().charAt(0);
        String nama;
        nama = in.nextLine();
        System.out.println(nama);
        int x = 12;
        int yx = (x>1 && x<=12)?'A':'B';
        a= yx;
        System.out.println();
        in.close();
    }
}


