import java.util.Scanner;

public class Pisos {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        
        int tipo2 = ((n+m)*2) - 4;
        
        int tipo1 = 0;
        
        tipo1 += n*m;
        tipo1 += (m-1)*(n-1); 
        
        System.out.println(tipo1);
        System.out.println(tipo2);
        
        
        
    }
    
}