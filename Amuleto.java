import java.util.*;
import java.lang.*;
import java.io.*;

public class Amuleto {
    public static void multiplicar(String a, int times) {
        for(int i=0; i<times; i++) {
            System.out.print(a);
        }
    }
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        while(input.hasNext()) {
            
            String palavra = input.nextLine();
            int tamanho = palavra.length();
            int i = 0;   
            
                while(tamanho > 0) {
                    multiplicar(" ", i);
                    
                    
                    for(int j = 0; j<tamanho; j++) {
                        String a = Character.toString(palavra.charAt(j));
                        if(j== tamanho - 1) {
                            System.out.print(a);
                            continue;
                        }
                        else System.out.print(a + " ");
                    }
                    
                    System.out.println();
                    i+=1;
                    tamanho--;
                    
                    
                }
                
        System.out.print("\n");        
        }
    }
}