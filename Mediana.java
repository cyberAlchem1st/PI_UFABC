import java.util.*;


public class Mediana {
    public static void ordenacao(int[] vetor) {
        int size = vetor.length;
        
        for(int i=0; i< size; i++) {
            int aux = i;
            
            for(int j=i+1; j<size; j++) {
            if(vetor[j] < vetor[aux]) aux = j;
                
            }
            
         int menor = vetor[aux];
         vetor[aux] = vetor[i];
         vetor[i] = menor;
        }
    }
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int numeros[] = new int[n];
        
        for(int i=0; i<n; i++) numeros[i] = input.nextInt();
        
        ordenacao(numeros);
        
        int p = n/2 - 1;
        
        double a = numeros[p];
        double b = numeros[p+1];
        
        if(n%2 != 0) System.out.printf("%.2f\n", b);
        
        else {
            double valor = (a+b)/2;
            System.out.printf("%.2f\n",valor);
        }
        
        
        
        
        
    }
}