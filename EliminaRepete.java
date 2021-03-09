import java.util.Scanner;

public class EliminaRepete {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        int[] v = new int[n];
        int[] v1 = new int[n];
        
        for(int i=0; i<n; i++) v[i] = input.nextInt();
        
        int s = 0;
        
        for(int i=0; i<n; i++) {
            boolean t = false;
            
            for(int j=0; j<s; j++) {
                
                if(v[i] == v1[j]) t= true;
            }
            
            if(t) continue;
            v1[s] = v[i];
            s++;
        }
        
        for(int i=0; i<s; i++) {
            if(i<s-1) System.out.print(v1[i] + " ");
            else System.out.println(v1[i]);
        }
        }
}