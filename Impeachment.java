import java.util.Scanner;

public class Impeachment {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        while(input.hasNext()) {
            int n = input.nextInt();
        
            double fav = 0;
            double con = 0;
            
            for(int i=0; i<n; i++) {
                int c = input.nextInt();
                if(c==1) fav++;
                if(c==0) con++;
            }
            
            double t = fav/n;
            double dois = 2;
            double tres = 3;
            double p = dois/tres;
            
            
            
            if(t>=p) System.out.println("impeachment");
            if(t<p) System.out.println("acusacao arquivada");
        }
        
    }
    
}