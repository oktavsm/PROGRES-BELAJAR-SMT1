package praktikum.praktikumpemdas1209;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        String nama,nim;

        Scanner input = new Scanner(System.in);
        int nilai1, nilai2, hasil;
        System.out.print("masukkan nilai 1: ");
        nilai1 = input.nextInt();
        System.out.print("masukkan nilai 2: ");
        nilai2 = input.nextInt();
        hasil = nilai1 + nilai2;
        System.out.print("maka hasil: " + hasil);
        
        input.nextLine();
        
        System.out.print("\n\nMasukkan nama : ");
        nama = input.nextLine();
        System.out.print("Masukkan NIM : ");
        nim= input.next();

        System.out.println("Nama yang diinput adalah : "+ nama);
        System.out.print("NIM yang diinput adalah : "+ nim);
        input.close();
        
    }
}
