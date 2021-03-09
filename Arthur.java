import java.util.*;

public class Arthur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while(input.hasNextLine()) {
            String palavra = input.nextLine();
            int tamanho = palavra.length();
            
            for(int b=0; b<= tamanho; b++) {
                for(int x = 1; x<= tamanho; x++) {
                    char k = palavra.charAt(x-1);
                    System.out.print(k);
                }
            }
        }
    }
}