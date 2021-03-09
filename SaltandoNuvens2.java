import java.util.Scanner;

public class SaltandoNuvens2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int k = input.nextInt(); 
        
        int[] v = new int[n];
        
        int gasto = 1;
        
        for(int i=0; i<n; i++) v[i] = input.nextInt();
        
        
        int i = 0;
        
        while((i+k)%n > 0) {
            
            if(v[i+k] == 1) gasto += 3;
            else if(v[i+k] == 0) gasto += 1;
            
            i+=k;
            
            
        }
        
        System.out.println(100 - gasto);
    }
    
}