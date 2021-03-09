import java.util.Scanner;

public class RepeteVetor {
    
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        int t, v, n;
        t = input.nextInt();
        v = input.nextInt();
        n = input.nextInt();
        
        int vetor[] = new int[n];
        
        for(int i=0;i<n; i++) vetor[i] = input.nextInt();
        
        if(t == 0) {
            
            int aux = 0;
            
            while(aux<v) {
                for(int i=0;  i<n; i++) {
                    if(i == n-1) System.out.println(vetor[i]);
                    else System.out.print(vetor[i] + " ");
                }
                
                aux++;
            }
        }
        
        if(t == 1) {
            
            int aux1 = 0;
            
            
            while(aux1<n) {
                int aux2 = 0;
                
                while(aux2 < v) {
                    if(aux2 == v - 1)  System.out.println(vetor[aux1]);
                    else System.out.print(vetor[aux1] + " ");
                    aux2++;
                }
                
                aux1++;
            }
        }
        
        
        
    }
    
    
}