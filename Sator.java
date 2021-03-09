import java.util.Scanner;

public class Sator {


    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        
        int n = 1;
        
        while(true) {
            n = input.nextInt();

            char v[][] = new char[n][n];
        
            /*if(n%2 == 0) {
                System.out.println("N");
                System.exit(0);
            }*/
        
            for(int i=0; i<n; i++) {
                for(int j=0; j<n; j++) v[i][j] = input.next().charAt(0);
            }
            
            char t[] = new char[n*n];
            
            int aux = 0;
            
            while(aux<(n*n)) {
                for(int i=0; i<n; i++) {
                    for(int j=0; j<n; j++) {
                        t[aux] = v[n-1-i][n-1-j];
                        aux++;
                    }
                }
            }
            
            int aux0 = 0;
            
            char t0[] = new char[n*n];
            
            while(aux0<(n*n)) {
                for(int i=0; i<n; i++) {
                    for(int j=0; j<n; j++) {
                        t0[aux0] = v[n-1-j][n-1-i];
                        aux0++;
                    }
                }
            }
            
            boolean ans = true;
            
            for(int i=0; i<n*n; i++) {
                if(t[i] != t[(n*n) - 1 - i]) {
                    ans = false;
                    break;
                }
            }
            
            for(int i=0; i<n*n; i++) {
                if(t0[i] != t0[(n*n) - 1 - i]) {
                    ans = false;
                    break;
                }
            }
            
            if(n == 0) break;
            
            if(ans) System.out.println("S");
            else System.out.println("N");
        }
        

    }

}