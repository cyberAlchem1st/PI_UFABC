import java.util.Scanner;

public class Carteiro {
    
    public static void reverse(int[] casas, int n) {
        for(int i=0; i<n/2; i++) {
            int c = casas[i];
            int c0 = casas[n-1-i];
            casas[i] = c0;
            casas[n-i-1] = c;
            
        }
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int m = input.nextInt();
        
        int[] casas = new int[n];
        int[] envios = new int[m];
        
        for(int i=0; i<n; i++) casas[i] = input.nextInt();
        for(int i=0; i<m; i++) envios[i] = input.nextInt();
        
        int tempo = 0;
        
        int aux = 0;
        int aux0 = 0;
        boolean crescente = true;
        
        while(aux<m) {
            
            if(aux0<0) {
                reverse(casas, n);
                aux0 = n-1;
                
                if(crescente == true) crescente = false;
                else if(crescente == false) crescente = true;
            }
            
            if(aux0>n-1) {
                reverse(casas, n);
                aux0 = 0;
                
                if(crescente == true) crescente = false;
                else if(crescente == false) crescente = true;
            }
            
            else if((envios[aux] != casas[aux0]) && (envios[aux] < casas[aux0]) && (crescente == true)) {
                tempo++;
                aux0--;
            }
            
            else if((envios[aux] != casas[aux0]) && (envios[aux] > casas[aux0]) && (crescente = true)) {
                tempo++;
                aux0++;
            }
            
            else if((envios[aux] != casas[aux0]) && (envios[aux] < casas[aux0]) && (crescente = false)) {
                tempo++;
                aux0++;
            }
            
            else if((envios[aux] != casas[aux0]) && (envios[aux] > casas[aux0]) && (crescente == false)) {
                tempo++;
                aux0--;
            }
            
            
            
            else if(envios[aux] == casas[aux0]) {
                aux++;
            }

        }
        
        System.out.println(tempo);
        
    }
    
}