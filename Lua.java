import java.util.*;
import java.lang.*;

public class Lua {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int b = input.nextInt();
        
        if(b <= 2) System.out.println("Nova");
        else if(b >= 3&& b<=96 && a < b) System.out.println("Crescente");
        else if(b >= 3 && b<=96 && a > b) System.out.println("Minguante");
        else if(b >= 97)System.out.println("Cheia");
        
    }
}