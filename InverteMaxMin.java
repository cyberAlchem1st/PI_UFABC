import java.util.*;

public class InverteMaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        
        int v[] = new int[n];
        
        for(int i=0; i<n; i++) v[i] = input.nextInt();
        
        int maior = 0;
        int menor = 2147483647;
        
        int idMaior = 0;
        int idMenor = 0;
        
        for(int i=0; i<n; i++) {
            if(v[i] > maior) {
                maior = v[i];
                idMaior = i;
            }
            
            if(v[i] < menor) {
                menor = v[i];
                idMenor = i;
            }
        }
        
        v[idMaior] = menor;
        v[idMenor] = maior;
        
        for(int i=0; i<n; i++) {
            if(i==n-1) System.out.println(v[i]);
            else System.out.print(v[i] + " ");
        }
        
        
    }
}