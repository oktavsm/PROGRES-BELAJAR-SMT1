import java.util.*;

public class opmatriks22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] mx1=new int[2][2];
        int[][] mx2=new int[2][2];

        for (int i = 0; i<2;i++){

            System.out.printf("Masukkan 2 nilai di baris ke %d : ", i);
            for(int j=0;j<2;j++){
                mx1[i][j] = in.nextInt();
            }
            
        }
        
        for (int i = 0; i<2;i++){
        
            System.out.printf("Masukkan 2 nilai di baris ke %d : ", i);
            for(int j=0;j<2;j++){
                mx2[i][j] = in.nextInt();
            }
        }
        
        int[][] cek = new int[2][2];
        cek=jumlah(kaliskalar(mx1, 2), kurang(kaliskalar(mx2, 3), mx1));
        
        pintar(mx2);
        
        pintar(cek);
        int[][] kali = new int[2][2];
        kali = kalimat(mx2, cek);
        pintar(kali);
        
        in.close();
    }
    
    public static int [][] jumlah (int[][] arr1, int arr2[][]){
        int[][]hasil = new int[2][2];
        for (int i = 0; i<2;i++){
            for(int j=0;j<2;j++){
                hasil[i][j]= arr1[i][j]+arr2[i][j];
            }
        }
                return hasil;
    }
    
    public static int [][] kurang (int[][] arr1, int arr2[][]){
        int[][]hasil = new int[2][2];
        for (int i = 0; i<2;i++){
            for(int j=0;j<2;j++){
                hasil[i][j]= arr1[i][j]-arr2[i][j];
            }
        }
                return hasil;
    }
    public static int [][] kalimat (int[][] arr1, int arr2[][]){
        int[][]hasil = new int[2][2];
        pintar(hasil);
        for (int i = 0; i<2;i++){
            for(int j=0;j<2;j++){
                int cek=0;
                for (int k=0;k<2;k++){
                    cek += arr1[i][k]+arr2[k][j];
                }
                hasil[i][j] = cek;
            }
        }
                return hasil;
    }
    
    public static int [][] kaliskalar (int[][] arr1, int x){
        int[][]hasil = new int[2][2];
        for (int i = 0; i<2;i++){
            for(int j=0;j<2;j++){
                hasil[i][j]= arr1[i][j]*x;
            }
        }
                return hasil;
    }

    public static void pintar (int [][]array1){
        for (int i=0;i<2;i++){
            System.out.println(Arrays.toString(array1[i]));
        }
    }



}
