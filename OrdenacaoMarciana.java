import java.util.Scanner;

public class OrdenacaoMarciana {
    // 0, 5, 6, 4, 8, 9, 7, 3, 1, 2.
        public static int transforma(int x) {
            int ans = 0;
            int n = x/100000;
            x = x%100000;
            
            if(n == 5) ans += 100000;
            if(n == 6) ans += 200000;
            if(n == 4) ans += 300000;
            if(n == 8) ans += 400000;
            if(n == 9) ans += 500000;
            if(n == 7) ans += 600000;
            if(n == 3) ans += 700000;
            if(n == 1) ans += 800000;
            if(n == 2) ans += 900000;
            
            n = x/10000;
            x = x%10000;
            
            if(n == 5) ans += 10000;
            if(n == 6) ans += 20000;
            if(n == 4) ans += 30000;
            if(n == 8) ans += 40000;
            if(n == 9) ans += 50000;
            if(n == 7) ans += 60000;
            if(n == 3) ans += 70000;
            if(n == 1) ans += 80000;
            if(n == 2) ans += 90000;
            
            n = x/1000;
            x = x%1000;
            
            if(n == 5) ans += 1000;
            if(n == 6) ans += 2000;
            if(n == 4) ans += 3000;
            if(n == 8) ans += 4000;
            if(n == 9) ans += 5000;
            if(n == 7) ans += 6000;
            if(n == 3) ans += 7000;
            if(n == 1) ans += 8000;
            if(n == 2) ans += 9000;
            
            n = x/100;
            x = x%100;
            
            if(n == 5) ans += 100;
            if(n == 6) ans += 200;
            if(n == 4) ans += 300;
            if(n == 8) ans += 400;
            if(n == 9) ans += 500;
            if(n == 7) ans += 600;
            if(n == 3) ans += 700;
            if(n == 1) ans += 800;
            if(n == 2) ans += 900;
            
            n = x/10;
            x = x%10;
            
            if(n == 5) ans += 10;
            if(n == 6) ans += 20;
            if(n == 4) ans += 30;
            if(n == 8) ans += 40;
            if(n == 9) ans += 50;
            if(n == 7) ans += 60;
            if(n == 3) ans += 70;
            if(n == 1) ans += 80;
            if(n == 2) ans += 90;
            
            n = x/1;
            x = x%1;
            
            if(n == 5) ans += 1;
            if(n == 6) ans += 2;
            if(n == 4) ans += 3;
            if(n == 8) ans += 4;
            if(n == 9) ans += 5;
            if(n == 7) ans += 6;
            if(n == 3) ans += 7;
            if(n == 1) ans += 8;
            if(n == 2) ans += 9;
            
            return ans;
        }
        
        public static int destransforma(int x) {
            int ans = 0;
            int n = x/100000;
            x = x%100000;
            
            if(n == 1) ans += 500000;
            if(n == 2) ans += 600000;
            if(n == 3) ans += 400000;
            if(n == 4) ans += 800000;
            if(n == 5) ans += 900000;
            if(n == 6) ans += 700000;
            if(n == 7) ans += 300000;
            if(n == 8) ans += 100000;
            if(n == 9) ans += 200000;
            
            n = x/10000;
            x = x%10000;
            
            if(n == 1) ans += 50000;
            if(n == 2) ans += 60000;
            if(n == 3) ans += 40000;
            if(n == 4) ans += 80000;
            if(n == 5) ans += 90000;
            if(n == 6) ans += 70000;
            if(n == 7) ans += 30000;
            if(n == 8) ans += 10000;
            if(n == 9) ans += 20000;
            
            n = x/1000;
            x = x%1000;
            
            if(n == 1) ans += 5000;
            if(n == 2) ans += 6000;
            if(n == 3) ans += 4000;
            if(n == 4) ans += 8000;
            if(n == 5) ans += 9000;
            if(n == 6) ans += 7000;
            if(n == 7) ans += 3000;
            if(n == 8) ans += 1000;
            if(n == 9) ans += 2000;
            
            n = x/100;
            x = x%100;
            
            if(n == 1) ans += 500;
            if(n == 2) ans += 600;
            if(n == 3) ans += 400;
            if(n == 4) ans += 800;
            if(n == 5) ans += 900;
            if(n == 6) ans += 700;
            if(n == 7) ans += 300;
            if(n == 8) ans += 100;
            if(n == 9) ans += 200;
            
            
            n = x/10;
            x = x%10;
            
            if(n == 1) ans += 50;
            if(n == 2) ans += 60;
            if(n == 3) ans += 40;
            if(n == 4) ans += 80;
            if(n == 5) ans += 90;
            if(n == 6) ans += 70;
            if(n == 7) ans += 30;
            if(n == 8) ans += 10;
            if(n == 9) ans += 20;
            
            n = x/1;
            x = x%1;
            
            if(n == 1) ans += 5;
            if(n == 2) ans += 6;
            if(n == 3) ans += 4;
            if(n == 4) ans += 8;
            if(n == 5) ans += 9;
            if(n == 6) ans += 7;
            if(n == 7) ans += 3;
            if(n == 8) ans += 1;
            if(n == 9) ans += 2;
            
            
            return ans;
        }
        
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
        for(int i=0; i<n; i++) v[i] = transforma(v[i]);
        
        ordenacao(v);
        for(int i=0; i<n; i++) v[i] = destransforma(v[i]);
        
        for(int i=0; i<n; i++) {
            if(i<n-1) System.out.print(v[i] + " ");
            else System.out.println(v[i]);
        }
    }
} 