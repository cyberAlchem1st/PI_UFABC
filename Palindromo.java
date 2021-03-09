import java.util.*;

public class Palindromo {
    public static boolean teste(String a) {
        int size = a.length();
        boolean ans = true;
        
        for(int i=0; i<size; i++) {
            if(a.charAt(i) != a.charAt(size - 1 - i)) ans = false;
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while(input.hasNext()) {
            String word = input.next();
            if(teste(word)) System.out.println("sim");
            else System.out.println("nao");
            
        }
        
    }
}