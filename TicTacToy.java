import java.util.Scanner;

public class TicTacToy {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        
        char v[][] = new char[3][3];
        
        int aux = 0;
        
        while(aux<n) {
            
            int jogador0 = 0;
            int jogador1 = 0;
            
            for(int i=0; i<3; i++) {
                for(int j=0; j<3; j++) v[i][j] = input.next().charAt(0);
            }
            
            int o = 0;
            int x = 0;
            
            for(int i=0; i<3; i++) {
                x = 0;
                o = 0;
                
                for(int j=0; j<3; j++) {
                    if(v[i][j] == 'O') o++;   
                    if(v[i][j] == 'X') x++;  
                }
                
            if(o==3) jogador0++;
            if(x==3) jogador1++;
            }
            
            for(int i=0; i<3; i++) {
                x = 0;
                o = 0;
                
                for(int j=0; j<3; j++) {
                    if(v[j][i] == 'O') o++;   
                    if(v[j][i] == 'X') x++;  
                }
                
            if(o==3) jogador0++;
            if(x==3) jogador1++;
            }
            
            if(v[0][0] == 'O' && v[1][1] == 'O' && v[2][2] == 'O') jogador0++;
            if(v[0][0] == 'X' && v[1][1] == 'X' && v[2][2] == 'X') jogador1++;
            
            if(v[0][2] == 'O' && v[1][1] == 'O' && v[2][0] == 'O') jogador0++;
            if(v[0][2] == 'X' && v[1][1] == 'X' && v[2][0] == 'X') jogador1++;
            
            if(jogador0  > jogador1) System.out.println("o jogador O venceu");
            else if(jogador0 < jogador1) System.out.println("o jogador X venceu");
            else System.out.println("o jogo deu velha");
            
            aux++;
        }
        
    }
    
}