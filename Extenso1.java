import java.util.Scanner;

public class Extenso1 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        while(input.hasNext()) {
            int n = input.nextInt();
            
            int tamanho = 1;
            double aux = n;
            
            for(int i=0; i<5; i++) {
                
                if(aux/10 >= 1) tamanho++;
                aux = n%10;
            }
            
            System.out.println(tamanho);
            
        }
        
    }
    
}