import java.util.*;

public class AlbumDaCopa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n, c, m;
        
        n = input.nextInt();
        c = input.nextInt();
        m = input.nextInt();
        
        int cVetor[] = new int[c];
        int mVetor[] = new int[m];
        
        for(int i=0; i<c; i++) {
            cVetor[i] = input.nextInt();
        }
        
        for(int i=0; i<m; i++) {
            mVetor[i] = input.nextInt();
        }
        
        
        int aux;
        int aux2=0;
        
        for(int i=0; i<c; i++) {
            aux = 0;
            for(int j=0; j<m; j++) {
                if(cVetor[i] == mVetor[j]) {
                    aux++;
                }
            }
            
            if(aux>0) aux2++;
        }
        
        System.out.println(c - aux2);

    }
}