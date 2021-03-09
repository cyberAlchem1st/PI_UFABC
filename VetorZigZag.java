import java.util.Scanner;

public class VetorZigZag {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int v[] = new int[n];
        
        boolean aux = true;
        
        int answer = 0;
        

        for(int i=0; i<n; i++) {
            v[i] = input.nextInt();
        }
        
        if(n==1) {
            System.out.println(answer);
            System.exit(0);
        }
        
        if(v[0] > v[1]) aux = true;
        else if(v[0] < v[1]) aux = false;
        
        
        for(int i=0; i<n-1; i++) {
            if(aux) {
                if(v[i] < v[i+1]) {
                    
                    answer++;
                    continue;
                }
            }
            
            else if(aux==false){
                if(v[i] > v[i+1]) {
                    
                    answer++;
                    continue;
                }    
            }
            
            if(aux == true) aux = false;
            else if(aux == false) aux = true;
        }
        

        System.out.println(answer);
        
    }
    
    
}