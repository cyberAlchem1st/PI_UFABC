import java.util.Scanner;

public class RomaToIndu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while(input.hasNext()) {
            String n = input.next();
            
            int size = n.length();
            int v[] = new int[size];
            
            int answer = 0;

            for(int i=0; i<size; i++) {
                if(n.charAt(i) == 'I') v[i] = 1;
                else if(n.charAt(i) == 'V') v[i] = 5; 
                else if(n.charAt(i) == 'X') v[i] = 10; 
                else if(n.charAt(i) == 'L') v[i] = 50; 
                else if(n.charAt(i) == 'C') v[i] = 100; 
                else if(n.charAt(i) == 'D') v[i] = 500; 
                else if(n.charAt(i) == 'M') v[i] = 1000; 
            }
            
            
            for(int i=0; i<size; i++) {
                answer+= v[i];
            }
            
            int sub = 0;
            int aux = 0;
            
            for(int i=0; i<size-1; i++) {
                if(v[i] < v[i+1]) {
                    aux = (v[i] + v[i+1]) - (v[i+1] - v[i]);
                    sub += aux;
                }
                aux = 0;
            }
            
            
            
            System.out.println(answer - sub);
        }
        
    }
}