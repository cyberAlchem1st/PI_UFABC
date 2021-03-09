import java.util.Scanner;

public class DiagSec {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int m[][] = new int[n][n];
        
        int aux;
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                aux = input.nextInt();
                m[i][j] = aux;
            }
        }
        
        for(int i=0; i<n; i++) {
            System.out.println(m[i][n-i-1]);
        }


    }
}