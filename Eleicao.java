import java.util.*;
import java.lang.*;

public class Eleicao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int entrada=0;
        
        int chapa1 = 0;
        int chapa2 = 0;
        int chapa3 = 0;
        int branco = 0;
        int nulo = 0;
        
        while(entrada>=0) {
            entrada = input.nextInt();
            
            if(entrada == 1) chapa1++;
            else if(entrada == 2) chapa2++;
            else if(entrada == 3) chapa3++;
            else if(entrada == 0) branco++;
            else if(entrada > 3) nulo++;
        }
        
        System.out.println("Votos chapa 1:" + chapa1);
        System.out.println("Votos chapa 2:" + chapa2);
        System.out.println("Votos chapa 3:" + chapa3);
        System.out.println("Votos brancos:" + branco);
        System.out.println("Votos nulos:" + nulo);
        
        if(chapa1>chapa2 && chapa1>chapa3) System.out.println("==Vitoria chapa 1==");
        else if(chapa2>chapa1 && chapa2>chapa3) System.out.println("==Vitoria chapa 2==");
        else if(chapa3>chapa1 && chapa3>chapa2) System.out.println("==Vitoria chapa 3==");
        else System.out.println("==Empate==");
        
        
        
    }
}