import java.util.Scanner;

public class FreqMaiorMenor {
    
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        
        int l = input.nextInt();
        int k = input.nextInt();
        
        int m[][] = new int[l][k];
        
        int aux;
        
        for(int i=0; i<l; i++) {
            
            for(int j=0; j<k; j++) {
                aux = input.nextInt();
                m[i][j] = aux;
            }
        }
        
        int menor = 1000;
        double menort = 1;
        int maior = 0;
        double maiort = 1;
        
        for(int i=0; i<l; i++) {
            
            for(int j=0; j<k; j++) {
                
                if(m[i][j] == menor) menort++;
                if(m[i][j] < menor) {
                    menor = m[i][j];
                    menort = 1;
                }
                
                if(m[i][j] == maior) maiort++;
                if(m[i][j] > maior) {
                    maior = m[i][j];
                    maiort = 1;
                }
                
            }
        }
        
        double menorp = (menort/(l*k)) * 100;
        double maiorp = (maiort/(l*k)) * 100;
        
        System.out.print(menor + " ");
        System.out.printf("%.2f", menorp);
        System.out.println("%");
        
        System.out.print(maior + " ");
        System.out.printf("%.2f", maiorp);
        System.out.println("%");
        
    }
    
    
}