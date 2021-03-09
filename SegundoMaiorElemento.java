import java.util.Scanner;

public class SegundoMaiorElemento {
        
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int v[] = new int[n];
        
        for(int i=0; i<n; i++) v[i] = input.nextInt();
        
        int _number = Integer.MIN_VALUE;
        int id = 0;
        
        for(int i=0; i<n; i++) {
            if(v[i] > _number) {
                _number = v[i];
                id = i;
            }
        }
        
        v[id] = Integer.MIN_VALUE;;
        
        _number = Integer.MIN_VALUE;
        id = 0;
        
        for(int i=0; i<n; i++) {
            if(v[i] > _number) {
                _number = v[i];
                id = i;
            }
        }
        
        System.out.println(id + " " + _number);
        
    }
    
}