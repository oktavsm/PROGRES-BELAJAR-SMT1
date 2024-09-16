package praktikum.praktikumpemdas1209;

public class Output14 {



    public static void main(String[] args) {
        //Output1
        System.out.print("Hello World\n"); 
        //Output2
        System.out.println("\nBelajar ");
        System.out.println("Pemrograman " + "Java");
        //Output3
        System.out.printf("\n%s%c\n", "Pemrograman Java", '|');
        System.out.printf("%30s%c\n", "Pemrograman Java ", '|');
        System.out.printf("%-30s%c\n", "Pemrograman Java ", '|');
        System.out.printf("%30.5s%c\n", "Pemrograman Java ", '|');
        System.out.printf("%-30.8s%c\n","Pemrograman Java",'|');    
        //Output4
        float x = 7654.123456789F;
        System.out.printf("\n%d %3d %8d\n", 1234, -567, 8910);
        System.out.printf("%d %3d %+8d\n", 1234, -567, 8910);
        System.out.printf("%f %15f %15.3f\n ", x, x, x);

   } 




    }

