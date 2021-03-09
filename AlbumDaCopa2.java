import java.util.Scanner;

public class AlbumDaCopa2 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int c = input.nextInt();
        int m = input.nextInt();
        int v[] = new int[m];
        
        for(int i=0; i<m; i++) v[i] = input.nextInt();
        
        int x[] = new int[m];
        x[0] = -1;
        
        int tamanho = 0;
        boolean aux = false;
        
        for(int i=0; i<m; i++) {
            aux = false;
            
            for(int j=0; j<tamanho; j++) {
                if(v[i] == x[j]) aux = true; 
            }
            
            if(aux) continue;
            
            x[tamanho] = v[i];
            tamanho++;
        }
        
    System.out.println(c - tamanho);    
        
    }
}