import java.util.Scanner;

public class VetorX3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        int v[] = new int[n];
        
        
        for(int i=0; i<n; i++) {
            v[i] = input.nextInt() * 3;
        }
        
        for(int i=0; i<n; i++) {
            if(i<n-1) System.out.print(v[i] + " ");
            else System.out.println(v[i]);
        }
        
    }
}