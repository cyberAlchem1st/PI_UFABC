import java.util.Scanner;

public class Soremun {
    
    static void reverse(String line, int size) {
        for(int i=size-1; i>=0; i--) {
            
           System.out.print(line.charAt(i));
             
        }
        System.out.println();
    }
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        
        String line = input.nextLine();
        int size = line.length();
        
        reverse(line, size);
        
        
    }
    
}