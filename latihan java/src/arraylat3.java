import java.util.*;
import java.util.Arrays;


public class arraylat3 {
    
/**
 * @param args
 */
public static void main(String[] args) {
    Scanner in= new Scanner(System.in);
    //panjang array
    int n;
    System.out.print("Masukkan panjang array : ");
    n = in.nextInt();

    int[] x = new int[n];
    int[] y = new int[n];

    //input dan print array 1
    System.out.printf("Masukkan Array pertama dari 1 - %d : ", n);
    for (int i=0; i<n; i++){
        x[i] = in.nextInt();
    }
    
    //input dan print array 2
    System.out.printf("Masukkan Array kedua dari 1 - %d : ", n);
    for (int i=0; i<n; i++){
        y[i] = in.nextInt();
    }

    
    // menjumlahkan array1[i] dan array2[i]
    int[] xpy = plusar(x, y);

    //menggabung array
    int[] xygab= arraygab(x, y);

    //mengambil array yang suda digabung dan mengurutkannya
    int[]sort1= new int[xygab.length];
    sort1 = Arrays.copyOf(xygab, xygab.length);
    Arrays.sort(sort1);
    
    //mereverse urutan array
    int [] arrayrev1 = rev1(sort1);

    //mereverse urutan array dengan switch
    int [] arrayrev2 = rev2(sort1);
    //print array
    pintar(x,"Array1");
    pintar(y,"Array2");
    pintar(xpy,"Hasil penjumlahan array1 dan array2 : ");
    pintar(xygab, "Hasil penggabungan array : ");
    pintar(sort1,"Hasil sorting array : ");
    pintar(arrayrev1, "Hasil reversed sorting array : ");
    pintar(arrayrev2, "Hasil reverse array 2 : ");
    in.close();
}


private static void pintar (int[] array, String mess) {
    System.out.println(mess+": " +Arrays.toString(array));
}

private static int [] plusar(int[] a, int[] b){
    

    int[] plus = new int[a.length];

    for (int i=0 ; i<a.length;i++){
        plus[i]=a[i]+b[i];
    }

    return plus;
}

private static int[] arraygab(int[] array1, int array2[]){

    int gab[] = new int[2*array1.length];
    
    for  (int i=0 ; i<array1.length; i++){
        gab[i]=array1[i];
    }
    
    for  (int i=0 ; i<array2.length; i++){
        
        
        gab[(array2.length+i)]= array2[i];
    }

    return gab;
}

private static int[] rev1(int[] array1){
    int[] arrayrev = new int[array1.length];
    for (int i=0; i<array1.length;i++){
        arrayrev[i]=array1[array1.length-1-i];
    }
    return arrayrev;
}
private static int[] rev2(int[] array1){
    int[] reversed = new int[array1.length];

    for(int i = 0; i<array1.length/2;i++){
        reversed[i]=array1[array1.length-1-i];
        reversed[array1.length-1-i]=array1[i];
    }
    return reversed;


}








}
