import java.util.Scanner;

public class AbaixoDiagonalPrincipal {
    
    public static double soma(int x[][], int n) {
        double soma = 0;
        
        for(int j=0; j<n; j++) {
            
            for(int i=j+1; i<n; i++) soma += x[i][j];
                
        }
        
        return soma;
    }
    
        public static double media(int x[][], int n) {
        double soma = 0;
        double el = 0;
        
        for(int j=0; j<n; j++) {
            
            for(int i=j+1; i<n; i++) {
                el++;
                soma += x[i][j];
            }
        }
        
        double media = soma/el;
        
        return media;
    }
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);    
        
        char x = input.next().charAt(0);
        int n = input.nextInt();
        int m[][] = new int[n][n];
        
        int aux;
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                aux = input.nextInt();
                m[i][j] = aux;
            }
        }
        
        if(x == 'S') System.out.printf("%.1f\n", soma(m, n));
        
        else System.out.printf("%.1f\n", (media(m, n)));
    }
    
    
    
}