import java.util.Scanner;

public class GameOfThrones {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char alfabeto[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    
        String word = input.next();
        int c;
        int impars = 0;
        boolean ans = true;
        
        if(word.length()%2 != 0) {
            
    
            for(int j=0; j<26; j++) {
            
                c = 0;
                for(int i=0; i<word.length(); i++) {
                    if(alfabeto[j] == word.charAt(i)) c++;
                }
                
                if( c%2 != 0) {
                    impars++;
                }
            
                if(impars > 1) {
                    ans = false;
                    break;
                }
            
            }
        }
        
        else if(word.length()%2 == 0) {
            
    
            for(int j=0; j<26; j++) {
            
                c = 0;
                for(int i=0; i<word.length(); i++) {
                    if(alfabeto[j] == word.charAt(i)) c++;
                }
                
                if( c%2 != 0) {
                    impars++;
                }
            
                if(impars > 0) {
                    ans = false;
                    break;
                }
            
            }
        }
        
        if(ans) System.out.println("YES"); 
        else System.out.println("NO");
        
    }
}