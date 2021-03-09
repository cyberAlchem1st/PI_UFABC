import java.util.*;

public class Teste {
    public static int destransforma(int x) {
            int ans = 0;
            int n = x/10000;
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
        
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            
            System.out.println(destransforma(n));
        }
}