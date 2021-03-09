import java.util.*;
import java.lang.*;

public class Datas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        for(int i=0; i<n; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            
            boolean v = data(a, b, c);
            if(v == true) System.out.println("DATA VALIDA");
            else System.out.println("DATA INVALIDA");
        }
    }
    public static boolean data(int d, int m, int a) {
        
        boolean bissexto;
        boolean data = true;
        
        
		if(a%400 == 0) bissexto = true;
		else if(a%4 == 0 && a%100 != 0) bissexto = true;
		else bissexto = false;
		
		if(bissexto == true && m == 2 && d > 29) {
		    data = false;
		}
		
		else if(bissexto == false && m == 2 && d > 28) {
			data = false;
		}
		
		else if((m==4 || m == 6 || m == 9 || m == 11) && d > 30) {
		    data = false;
		}
		
		else if((m==1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10)  && d > 31) {
	    data = false;
		}
		
		else if(m > 12) {
		    data = false;
		}
		
		
		return data;
    }
}