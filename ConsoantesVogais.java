import java.util.Scanner;

public class ConsoantesVogais{
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        char C = input.next().charAt(0);
        
        String consoantes = "BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz";
        String vogais = "aeiouAEIOU";
        
        for(int i=0; i<consoantes.length(); i++) {
            if(C == consoantes.charAt(i)) {
                System.out.println("consoante");
                break;
            }
        }
        
        for(int i=0; i<vogais.length(); i++) {
            if(C == vogais.charAt(i)) {
                System.out.println("vogal");
                break;
            }
        }
        
    }
    
}