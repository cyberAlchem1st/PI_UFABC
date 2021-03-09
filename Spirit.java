import java.util.*;

public class Spirit {
    
    public static int letters(String a) {
        boolean aux = true;
        int number = 0;
        //s
        
        int i = 0;
        
        while(i<a.length()) {
            if(aux) {
                if(a.charAt(i) != 'S') number++;
                aux = false;
                i+=2; 
            }
            
            else {
                if(a.charAt(i) != 'S') number++;
                aux = true;
                i++; 
            }
        }
        
        // O
        
        for(int j=1; j<a.length(); j+= 3) {
            if(a.charAt(j) != 'O') number++;
            else continue;
        }
        
        return number;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String line = input.next();
        
        System.out.println(letters(line));
    }
}