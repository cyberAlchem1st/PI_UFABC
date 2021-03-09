import java.util.Scanner;

public class Borboletas {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int v[][] = new int[n][n];
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) v[i][j] = input.nextInt();
        }
        
        int c = 0;
        int b[] = new int[n*2];
        
        while(c<n*2) {
            int x = input.nextInt() - 1;
            int y = input.nextInt() - 1;
            
            b[c] = v[x][y];
            c++;
        }
        
        

        int q = 0;
        
        int t[] = new int[n*2];
                
        for(int i=0; i<n*2; i++) {
            boolean aux = false;
            
            for(int j=0; j<n*2; j++) {
                if(b[i] == t[j]) {
                    aux = true;   
                    break;
                }
            }
            
            if(aux) continue;
            else {
                t[q] = b[i];
                q++;
                
            }
        }
        
        System.out.println(q);
    }
    
}