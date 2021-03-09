import java.util.*;


public class Jokenpo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        
        char pedra = 'd';
        char papel = 'p';
        char tesoura = 's';
        int index = 2;
        
        for(int i = 0; i<n; i++) {
            String a = input.next();
            String b = input.next();
            
            char escolha1 = a.charAt(index);
            char escolha2 = b.charAt(index);
            
            if(a.charAt(index) == b.charAt(index)) System.out.println("empate");
            else if(escolha1 == pedra && escolha2 == tesoura) System.out.println("jogador 1");
            else if(escolha1 == papel && escolha2 == pedra) System.out.println("jogador 1");
            else if(escolha1 == tesoura && escolha2 == papel) System.out.println("jogador 1");
            else System.out.println("jogador 2");

        }
    }
}