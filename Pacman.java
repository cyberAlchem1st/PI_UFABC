import java.util.Scanner;

public class Pacman {
    
    
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        
        char v[] = new char[n];
        
        
        boolean type = true;
        
        int c = 0;
        int cmaior = 0;
        
        int aux = 0;
        String linha;
        
        
        while(aux<n) {
            
            if(type) {
                linha = input.next();
                
                for(int i=0; i<n; i++) {
                v[i] = linha.charAt(i);
                }
            }
        
            else {
                int j = n - 1;
                linha = input.next();
                
                for(int i=0; i<n; i++) {
                v[i] = linha.charAt(j);
                j--;
                }
            }
            
            for(int i=0; i<n; i++) {
                if(v[i] == 'o') c++;
                if(c > cmaior) cmaior = c;
                else if(v[i] == 'A') {
                    
                    c = 0;
                }
                
                
            }
            
            
            
            //reset
            aux++;
            if(type == true) type = false;
            else if(type == false) type = true;
            
            for(int i=0; i<n; i++) v[i] = 0;
            
        }
        
        System.out.println(cmaior);
      
        
    }
    
    
}