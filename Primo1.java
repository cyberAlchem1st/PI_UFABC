import java.util.Scanner;

public class Primo1 {
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
        int array[] =  new int[10];
        
        int posicao = 0;
        
        for(int i=2; i<n; i++) {
            if(ehPrimo(i)) {
                array[posicao] = i;
                posicao++;
            }
            
        }
        
        for(int i=0; i<=posicao; i++) {
            System.out.println("O numero: " + array[i] + " e primo.");
            float p = i;
            System.out.printf("Sua posicao no vetor e: %.2f\n", p);
            
        }
        
        
    }
}