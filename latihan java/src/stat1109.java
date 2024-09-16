import java.util.*;
public class stat1109 {
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        float[] a = new float[n];
        
        Arrays.fill(a, 0);
        System.out.println(Arrays.toString(a));
        float sum=0;
        System.out.println("Input Array : ");
        for (int i=0; i<a.length;i++){
            a[i] = in.nextFloat();
            
            sum+=a[i];
        }
        sum/=a.length;
        System.out.printf("Mean dari %s adalah = %f\n", Arrays.toString(a), sum);
        
        in.close();       
}
}
