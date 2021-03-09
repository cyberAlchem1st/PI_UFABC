import java.util.Scanner;

public class CidadeSegura {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt() + 1;
        int v[][] = new int[n][n];
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) v[i][j] = input.nextInt();
        }
        
        for(int i=0; i<n-1; i++) {
            
            
            for(int j=0; j<n-1; j++) {
                int sum = v[i][j] + v[i+1][j+1] + v[i+1][j] + v[i][j+1];
                
                if(sum>1) System.out.print("S");
                else System.out.print("U");
            }
            System.out.println();
            
        }
        
        
        
        
        
        
        
    }
    
}