import java.util.Scanner;

public class Cesar {
    
    public static void cesar(String line, int n) {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String point = " .;?:!*,-)(&%$#@+=0123456789";
        
        for(int i=0; i<line.length(); i++) {
                
                for(int k=0; k<point.length(); k++) {
                    if(line.charAt(i) == point.charAt(k)) System.out.print(point.charAt(k));
                }
                
                for(int j=0; j<upper.length(); j++) {
                    if(j+n > 25) {
                        if(line.charAt(i) == upper.charAt(j)) System.out.print(upper.charAt(j+n-26));    
                        if(line.charAt(i) == lower.charAt(j)) System.out.print(lower.charAt(j+n-26));  
                    }
                    
                    else {
                        if(line.charAt(i) == upper.charAt(j)) System.out.print(upper.charAt(j+n));    
                        if(line.charAt(i) == lower.charAt(j)) System.out.print(lower.charAt(j+n));  
                    }
                    
                }
                
                if(i == line.length() - 1) System.out.println();
            }
        
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        
        
        
        while(input.hasNext()) {
            
            String line = input.nextLine();
            
            cesar(line, n);
        }
        
    }
}