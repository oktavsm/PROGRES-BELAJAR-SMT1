

import java.util.*;


public class arraylat {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n;
        while (true){
            System.out.print("\n\nBerapa banyak bilangannya? : ");
        n= input.nextInt();

        int x;
        System.out.print("\n\n1. Terkecil\n2. Terbesar\nDari terkecil atau terbesar? : ");
        x= input.nextInt();
        if (x==1){
            terkecil(n);
        } else if (x==2){
            terbesar(n);
        } else {
            System.out.println("Pilihannya cuman 1/2 ya!!!!!");
            continue;
        }

        System.out.print("Lagi gakkk??\nTekan 1 kalau mau lagiiiii : ");
        x=input.nextInt();
        if(x==1){
            continue;
        } else {
            break;
        }
        }
        
        
        
    }

    static void terkecil (int n){
        Scanner input = new Scanner(System.in);
        int[] x = new int[n];

        for (int i = 0; i<n;i++){
            x[i] = input.nextInt();
        }
            int temp;        
        for (int i=0; i<n-1;i++){
            for (int j=i+1;j<n;j++){
                if (x[j]<x[i]){
                    temp=x[i];
                    x[i]=x[j];
                    x[j]=temp;
                }
    

            }
            
            
            
        }
        System.out.println("\n\nHasil sorting dari yang terkecil adalah\n"+Arrays.toString(x) + "\n\n\n");
    }

    static void terbesar (int n){
        Scanner input = new Scanner(System.in);
        int[] x = new int[n];

        for (int i = 0; i<n;i++){
            x[i] = input.nextInt();
        }
            int temp;        
        for (int i=0; i<n-1;i++){
            for (int j=i+1;j<n;j++){
                if (x[j]>x[i]){
                    temp=x[i];
                    x[i]=x[j];
                    x[j]=temp;
                }
    

            } 
            
        }
        System.out.println("\n\nHasil sorting dari yang terbesar adalah : \n"+Arrays.toString(x) + "\n\n\n");
    }

}
