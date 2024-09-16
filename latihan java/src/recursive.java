import java.util.*;

public class recursive {

public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    int x;

    x=input.nextInt();

    
    System.out.println(sum(x));
    System.out.println(fact(x));

}

static int sum (int i){
    if (i==1){
        return 1;
    }

    return sum(i-1) + i;
}

static int fact (int x){
    if (x==1){
        return 1;
    }

    return fact(x-1) * x;
}
}