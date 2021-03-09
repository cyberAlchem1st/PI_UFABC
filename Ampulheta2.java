import java.util.Scanner;

public class Ampulheta2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int v[][] = new  int[n][n];
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) v[i][j] = input.nextInt();
        }
        
        if(n<3) {
            System.out.println(0);
            System.exit(0);
        }
        int _sum = -1000;
        
        int c = 0;
        
        while(c<n-2) {
            
            int _sumup = -1000;

            
            for(int i=0; i<n-2; i++) {
                int sumup = 0;
                
                sumup += v[c][i] + v[c][i+1] + v[c][i+2] +v[c+1][i+1] + v[c+2][i] + v[c+2][i+1] + v[c+2][i+2];
                if(sumup > _sumup) {
                    _sumup = sumup;
                }
            }
            
            if(_sumup > _sum) _sum = _sumup;
            c++;
        }
        
        System.out.println(_sum);
    }
    
}