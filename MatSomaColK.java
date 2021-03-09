import java.util.Scanner;

public class MatSomaColK {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int k = input.nextInt();
        
        int m[][] = new int[n][n];
        int aux;
        
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                aux = input.nextInt();
                m[i][j] = aux;
            }
        }
        
        int soma = 0;
        
        for(int i=0; i<n; i++) soma += m[i][k];
        
        System.out.println(soma);
        
    }
}