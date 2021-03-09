import java.util.Scanner;

public class Chocolate {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        
        int v[] = new int[n];
        
        for(int i=0; i<n; i++) v[i] = input.nextInt();
        
        
        int sum = input.nextInt();
        int length = input.nextInt();
        
        int c = 0;
        

        for(int i=0; i<=n-length; i++) {
            int aux = 0;
            
            for(int j=0; j<length; j++) {
                aux += v[i+j];
            }
            
            if(aux == sum) c++;
            
        }

        
        System.out.println(c);
        
    }
    
}