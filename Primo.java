import java.util.Scanner;

public class Primo {
    public static boolean ehPrimo(int numero) {
        boolean ans = true;
        
        for(int j=2; j<numero; j++) {
            
            if(numero%j == 0) ans = false ;
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int array[] = new int[n];
        
        float posicao = 0;
        
        for(int i=2; i<n; i++) {
            if(ehPrimo(i)) {
                System.out.printf("%.2f\n", posicao + 1);
                
            }
            
            posicao++;
            
        }
    }
}