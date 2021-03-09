import java.util.Scanner;

public class OrdenaNumeros1 {
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
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        int v[] = new int[n];
        
        for(int i=0; i<n; i++) v[i] = input.nextInt();
        
        ordenacao(v);
        
        for(int i=0; i<n; i++) {
            if(i<n-1) System.out.print(v[i] + " ");
            else System.out.println(v[i]);
        }
    }
} 