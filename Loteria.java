import java.util.Scanner;

public class Loteria {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt() + 1;
        int v[][] = new int[n][6];
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<6; j++) v[i][j] = input.nextInt();
        }
        
        int sena = 0;
        int quina = 0;
        int quadra = 0;
        
        for(int i=0; i<n-1; i++) {
            int aux = 0;
            
            for(int j=0; j<6; j++) {
                for(int k=0; k<6; k++) {
                    if(v[i][j] == v[n-1][k]) aux++;
                }
            }
            
            if(aux == 4) quadra++;
            else if(aux == 5) quina++;
            else if(aux == 6) sena++;
            
        }
        
        if(sena == 0 ) System.out.println("Nao houve acertador para sena");
        else System.out.println("Houve " + sena + " acertador(es) da sena");
        if(quina == 0 ) System.out.println("Nao houve acertador para quina");
        else System.out.println("Houve " + quina + " acertador(es) da quina");
        if(quadra == 0 ) System.out.println("Nao houve acertador para quadra");
        else System.out.println("Houve " + quadra + " acertador(es) da quadra");
        
    }
    
    
}