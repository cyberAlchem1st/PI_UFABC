import java.util.Scanner;

public class JokenpoSheldon {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        for(int i=0; i<n; i++) {
            String rajesh = input.next();
            String sheldon = input.next();
            
            char x = rajesh.charAt(2);
            char y = sheldon.charAt(2);
            
            
            if(x == y) System.out.println("empate");
            else if(x == 's' && y == 'p') System.out.println("rajesh");
            else if(x == 'p' && y == 'd') System.out.println("rajesh");
            else if(x == 'd' && y == 'g') System.out.println("rajesh");
            else if(x == 'g' && y == 'o') System.out.println("rajesh");
            else if(x == 'o' && y == 's') System.out.println("rajesh");
            else if(x == 's' && y == 'g') System.out.println("rajesh");
            else if(x == 'g' && y == 'p') System.out.println("rajesh");
            else if(x == 'p' && y == 'o') System.out.println("rajesh");
            else if(x == 'o' && y == 'd') System.out.println("rajesh");
            else if(x == 'd' && y == 's') System.out.println("rajesh");
            else System.out.println("sheldon");
        }
        
    }
    
}