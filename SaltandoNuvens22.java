import java.util.Scanner;

public class SaltandoNuvens22 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int k = input.nextInt();
        int[] v = new int[n];
        
        int saltos = 0;
        
        for(int i=0; i<n; i++) v[i] = input.nextInt();
        
        int i = n-1;
        
        while(i>0) {
            int t = (i+k)%n;
            
            if(v[i-t] == 0) {
                saltos += 1;
                i = i-t;
            } 
            
            if(v[i-t] == 1) {
                saltos += 3;
                i = i-t;
            } 

            
    
        }
        
        System.out.println(100-saltos);
    }
    
}