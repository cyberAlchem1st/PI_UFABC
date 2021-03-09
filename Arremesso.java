import java.util.*;

public class Arremesso {
    public static int[] possivel(int x) {
        
        int[] places = new int[1000];
        int i = 0; 
        
        while(x>0) {

            if(i<x) {
                while(i<x) {
                    places[i] = x*(i+1);
                    i++;
                    
                }
            }
            
            else {
                x = x - 1;
                places[i] = places[i-1] + x;
                i++;
            }
            
            
        }
        return places;
    }
    
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int v = input.nextInt();
        
        while(n>0 && v>0) {
        
        int[] pontos = possivel(v);
        
        int aux = 0;
        
        for(int i=0; i<pontos.length; i++) {
            if(pontos[i] == n) aux++;
        }
        
        int aux0 = 0;
        
        for(int i=1; i<v; i++) {
            int[] teste = possivel(i);
            for(int j = 0; j<teste.length; j++) {
                if(teste[j] == n) aux0++;
                
            }
            
        }
        
        if(aux>0) System.out.println("impossivel");
        else if(aux0 > 0) System.out.println("possivel");
        else System.out.println("possivel");
        
        n = input.nextInt();
        v = input.nextInt();
        }
        
    }
}
