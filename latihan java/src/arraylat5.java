import java.util.*;

public class arraylat5 {
    public static void main(String[] args) {
        int a,b;
        System.out.print("Masukkan besar array[][] : ");
        Scanner in = new Scanner(System.in);
        //a = lebar array b=panjang array
        a = in.nextInt();
        b= in.nextInt();

        int[][] array2d = new int[a][b];

        for (int i=0;i<a;i++){
            for (int j=0; j<b ; j++){
                
                System.out.printf("Masukkan nilai di baris ke %d kolom ke %d : ",i,j);
                array2d[i][j] = in.nextInt();
            }
        }

        for (int i=0;i<a;i++){
                System.out.println(Arrays.toString(array2d[i]));
        }
        in.close();
    }
}
