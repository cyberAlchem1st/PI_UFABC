import java.util.*;
import java.lang.*;

public class Crescimento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        
        for(int i=0; i<n; i++) {
            int pa = input.nextInt();
            int pb = input.nextInt();
            float g1 = input.nextFloat();
            float g2 = input.nextFloat();
            
            int anos = tempo(pa, pb, g1, g2);

            if(anos <= 100) System.out.println(anos + " anos.");
            else System.out.println("Mais de 1 seculo.");
        }
    }
    
    public static int tempo(float pa, float pb, float g1, float g2) {
        float p1 = 1 + (g1/100);
        float p2 = 1 + (g2/100);
        
        int contador = 0;
        
        while(pa<pb) {
            pa = pa * p1;
            pb = pb * p2;
            contador++;
        }
        
        return contador;
    }
}