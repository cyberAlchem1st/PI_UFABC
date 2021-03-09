import java.util.*;
import java.lang.*;

public class Cha {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int aux = 0;
        
        for(int i = 0; i<5; i++) {
            int b = input.nextInt();
            if(n==b) aux++;
        }
        
        System.out.println(aux);
    }
}