import java.util.*;

public class DigaFrequencia {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String a = input.next();
        
        String b = "!";
        int sizeb = 1;
        int c = 0;
        boolean aux = false;
        
        for(int i=0; i<a.length(); i++) {
            aux = false;
            
            for(int k=0; k<sizeb; k++) {
                if(a.charAt(i) == b.charAt(k)) aux = true; 
            }
            
            if(aux) continue;
            
            c = 0;
            for(int j=0; j<a.length(); j++) {
                if(a.charAt(i) == a.charAt(j)) c++;
            }
            
            b += a.charAt(i);
            System.out.println(a.charAt(i) + " - " + c);
            sizeb++;
        }
     
     //System.out.println(" hahaha " + b);   
    }
}