import java.util.Scanner;

public class Consoantes {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        String s = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        
        char n = '0';
        int aux = 0;
        
        while(n!='*') {
            n = input.next().charAt(0);
            
            
            for(int i=0; i<s.length(); i++) {
                if(n == s.charAt(i)) aux++;
            }
        }
        
        System.out.println(aux);
        
    }
    
}