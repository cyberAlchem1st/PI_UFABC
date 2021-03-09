import java.util.*;

public class AulaCancelada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int k = input.nextInt();
        
        int c = 0;
        
        for(int i=0; i<n; i++) {
            int tempo = input.nextInt();
            if(tempo <= 0) c++;
        }
        
        if(c >= k) System.out.println("NAO");
        else System.out.println("SIM");
    }
}