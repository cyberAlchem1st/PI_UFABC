import java.util.*;
import java.lang.*;
import java.io.*;

public class ContaDigPares {
    
    public static int tamanho(int x) {
        int aux = 0;
        while(x>0) {
            if(x%2 == 0) aux++;
            x = x/10;

        }
        return aux;
    }
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        while(input.hasNext()) {
            int n = input.nextInt();
            
            System.out.println(tamanho(n));
        }
    }
}