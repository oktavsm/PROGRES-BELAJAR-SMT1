import java.util.*;



public class method {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x,y;
        while (true){
            System.out.print("Masukan lebar : ");
            x = input.nextInt();
            System.out.print("Masukan panjang : ");
            y=input.nextInt();

            gambar(x,y);
             int in;

            System.out.print("\n\nLagi? (1. Ya, 2. Tidak) : ");
            in=input.nextInt();
            if (in==1){
                continue;
            } else if (in==2){
                return;
            } else {return;}
        }

    }

    private static void gambar(int lebar, int panjang) {
        for (int i=1; i<=lebar; i++){
            
            for (int j=1; j<=panjang; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
