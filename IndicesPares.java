import java.util.*;

public class IndicesPares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int vetor[] = new int[n];
        
        
        int c = 0;
        
        for(int i=0; i<n; i++) {
            vetor[i] = input.nextInt();
        }
        
        for(int i=0; i<n; i++) {
            if(vetor[i] % 2 == 0) {
                c++;
            }
        }
        
        for(int i=0; i<n; i+=2) System.out.print(vetor[i] + " ");
        
        System.out.println(c);
        
        
        
    }
}