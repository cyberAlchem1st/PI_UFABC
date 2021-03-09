import java.util.Scanner;

public class Huaauhahhuahau {
    
    public static boolean comparaString(String x, String y) {
        boolean answer = true;
        int sizex = x.length();
        int sizey = y.length();
        
        if(sizex != sizey) {
            answer = false;
            return answer;
        }
    
        for(int i=0; i<sizex; i++) {
            if(x.charAt(i) != y.charAt(i)) {
                answer = false;
                return answer;
            }
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String a;
        String b = "";
        String c = "";
        
        
        a = input.next();
        
        int size = a.length();
        char p;
        
        
        for(int i=0; i<size; i++) {
            p = a.charAt(i);
            
            if(p == 'a' || p == 'e' || p == 'i' || p == 'o' || p == 'u') b += p;     
        }
        
        for(int i=size -1; i>=0; i--) {
            p = a.charAt(i);
            
            if(p == 'a' || p == 'e' || p == 'i' || p == 'o' || p == 'u') c += p;     
        }
        
        
        if(comparaString(b, c)) System.out.println("S");
        else System.out.println("N");
        
        
    }
}