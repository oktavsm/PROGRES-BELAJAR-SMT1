
//membuat while loop membuat segitiga siku siku berdasarkan input

import java.util.*;


public class segitiga {
  
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int x,y;
        
        

        while (true) {
            
            System.out.print("1. Segitiga 1 \n2. Segitiga 2 \n3. Segitiga 3\n4. Segitiga 4\n5. Segitiga 5 \n6. Segitiga 6\n7. Berhenti \nMau segitiga apa? : ");
            x= input.nextInt();

            if (x==1) {
                System.out.print("Masukan tinggi segitiga : ");
                y = input.nextInt();
                for (int i = 1 ; i<=y; i++){
                    for (int j=1; j<=i;j++){
                        System.out.print("* ");
                    }
                        System.out.println();
                }
            } else if (x==2){
                System.out.print("Masukan tinggi segitiga : ");
                y = input.nextInt();
                for (int i = 1 ; i<=y; i++){
                    for (int j=y; j>=i;j--){
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            } else if (x==3){
                System.out.print("Masukan tinggi segitiga : ");
                y = input.nextInt();
                for (int i = 1 ; i<=y; i++){
                    for (int j=y-1; j>=i;j--){
                        System.out.print("  ");
                    }
                    for (int j = 1; j<=i; j++){
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            } else if (x==4){
                System.out.print("Masukan tinggi segitiga : ");
                y = input.nextInt();
                for (int i = 1 ; i<=y; i++){
                    for (int j=1; j<i;j++){
                        System.out.print("  ");
                    } for (int j=y; j>=i; j--){
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            } else if (x==5){
                System.out.print("Masukan tinggi segitiga : ");
                y = input.nextInt();
                for (int i = 1 ; i<=y; i++){
                    for (int j=y-1; j>=i;j--){
                        System.out.print("  ");
                    }
                    for (int j = 1; j<=i*2-1; j++){
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            } else if (x==6){
                System.out.print("Masukan tinggi segitiga : ");
                y = input.nextInt();
                
                for (int i = 1; i <= y; i++){
                    for (int j=1; j<i; j++){
                        System.out.print("  ");
                    }
                    for (int j = 1; j<=y*2-(i*2-1) ; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                

            }
            
            
            
            else if (x==7){
            break;
            }
                else {
                System.out.print("Input hanya bisa 1 atau 2");
            continue;
            }

        }

    
    }

     


}
