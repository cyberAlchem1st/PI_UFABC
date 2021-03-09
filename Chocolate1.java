import java.util.Scanner;

public class Chocolate1{
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int m = input.nextInt();
        int v[][] = new int[n][m];
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) v[i][j] = input.nextInt();
        }
        
        int sum = input.nextInt();
        int length = input.nextInt();
        
        int c = 0;
        
        for(int i=0; i<n; i++) {
            
            for(int j=0; j<m-length+1; j++) {
                
                 int aux = 0;
                
                for(int k=0; k<length; k++) {
                    
                    aux += v[i][j+k];
                    if(aux == sum) {
                        c++;
                        aux = 0;
                    }
                }
                
            }
        }
        
        System.out.println(c);
        
    }
    
}