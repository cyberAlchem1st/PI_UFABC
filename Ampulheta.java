import java.util.Scanner;

public class Ampulheta {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int v[][] = new  int[6][6];
        
        for(int i=0; i<6; i++) {
            for(int j=0; j<6; j++) v[i][j] = input.nextInt();
        }
        
        int _sum = -71;
        
        int c = 0;
        
        while(c<4) {
            
            int _sumup = -71;
            //int _middle = -10;
            int _sumdown = -71;
            
            int range = 0;
            
            
            for(int i=0; i<4; i++) {
                int sumup = v[c][i] + v[c][i+1] + v[c][i+2] +v[c+1][i+1];
                if(sumup > _sumup) {
                    _sumup = sumup;
                    range = i;
                }
            }
            
            /*for(int i=range; i<range+3; i++) {
                int middle = v[c+1][i];
                if(middle > _middle) _middle = middle;
            }*/
            
            /*int middle = v[c+1][range+1];
            if(middle > _middle) _middle = middle;
            */
            
            for(int i=0; i<4; i++) {
                int sumdown = v[c+2][i] + v[c+2][i+1] + v[c+2][i+2];
                if((sumdown > _sumdown) && i>= range && i<= range+2) _sumdown = sumdown;
            }
            
            //int sum = _sumup + _middle + _sumdown;
            int sum = _sumup + _sumdown;
            
            if(sum > _sum) _sum = sum;
            
            /*System.out.println(v[c][range] + " " +v[c][range+1] + " " + v[c][range+2]);
            System.out.println(v[c+1][range+1]);
            System.out.println(v[c+2][range] + " " +v[c+2][range+1] + " " + v[c+2][range+2]);
            */
            c++;
            
            
        }
        
        System.out.println(_sum);
    }
    
}