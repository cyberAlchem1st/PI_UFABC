import java.util.*;
import java.lang.*;

public class CachorrosQuentes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float h = input.nextFloat();
        float p = input.nextFloat();
        
        double media = h/p;
        
        System.out.printf("%.2f\n", media);
        
    }
}