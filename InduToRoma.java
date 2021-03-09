import java.util.Scanner;

public class InduToRoma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while(input.hasNext()) {
            int n = input.nextInt();
            String answer = "";

            //1000
            
            int m = n/1000;
            n = n%1000;
            
            for(int i=0; i<m; i++) answer += "M";
            
            //100
            
            int c = n/100;
            n = n%100;
            
            if(c==9) answer += "CM";
            
            else if(c>=5 && c<9) {
                answer += "D";
                for(int i=0; i<c-5; i++) answer += "C";
                
            }
            
            else if(c == 4) answer += "CD";
            
            else for(int i=0; i<c; i++) answer += "C";
            
            //10
            
            int d = n/10;
            n = n%10;
            
            if(d==9) answer += "XC";
            
            else if(d>=5 && d<9) {
                answer += "L";
                for(int i=0; i<d-5; i++) answer += "X";
                
            }
            
            else if(d == 4) answer += "XL";
            
            else for(int i=0; i<d; i++) answer += "X";
            
            //1
            
            if(n==9) answer += "IX";
            
            else if(n>=5 && n<9) {
                answer += "V";
                for(int i=0; i<n-5; i++) answer += "I";
                
            }
            
            else if(n == 4) answer += "IV";
            
            else for(int i=0; i<n; i++) answer += "I";
            
            System.out.println(answer);
        }
        
    }
}