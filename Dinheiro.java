import java.util.*;
import java.lang.*;

public class Dinheiro {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        
        if(n%10 != 0) {
            System.out.println("nao eh possivel fazer um saque desse valor");
            
            System.exit(0);
        }
        
        int cinquenta = n/50;
        if(cinquenta > 0) {
            n = n%50;
        }
        
        int vinte = n/20;
        
        if(vinte > 0) {
            n = n%20;
        }
        
        int dez = n/10;
        
        if(dez > 0) {
            n = n%10;
        }
        
        System.out.println(cinquenta + " notas de cinquenta");
        System.out.println(vinte + " notas de vinte");
        System.out.println(dez + " notas de dez");
    }
}