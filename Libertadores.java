import java.util.*;
import java.lang.*;

public class Libertadores {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        
        for(int i = 0; i<n; i++) {
            char nuu;
            int time1 = 0;
            int time2 = 0;
            int adv1 = 0;
            int adv2 = 0;
            
            //primeira partida
            int m = input.nextInt();
            nuu = input.next().charAt(0);
            int v = input.nextInt();
            
            if(m == v) {
                time1 += 1;
                time2 += 1;
            } //empate
            
            else if(m>v) {
                time1 += 3;
            }
            
            else if(m<v) {
                time2 += 3;
            }
            
            adv2 += v;
            
            
            //segunda partida
            
            int v2 = input.nextInt();
            nuu = input.next().charAt(0);
            int m2 = input.nextInt();
            
            if(v2 == m2) {
                time1 += 1;
                time2 += 1;
            } //empate
            
            else if(v2>m2) {
                time2 += 3;
            }
            
            else if(v2<m2) {
                time1 += 3;
            }
            
            adv1 += m2;
            
            if(time1 > time2) System.out.println("Time 1");
            else if(time1 < time2) System.out.println("Time 2");
            else if(time1 == time2) {
                if(adv1 > adv2) System.out.println("Time 1");
                else if(adv1 < adv2) System.out.println("Time 2");
                else if(adv1 == adv2) System.out.println("Penaltis");
            }
        }
        
        
    }
}