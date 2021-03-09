import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class BackToTheFuture {
    
    public static void main(String args[]) {
        
        DateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Calendar cal = Calendar.getInstance();

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        for(int i=0; i<n; i++) {
            
            
            
            int d = input.nextInt();
            int m = input.nextInt();
            int a = input.nextInt();
            
            int num = input.nextInt();
            int aux = 0;
            
            String line = input.next();
            
            
            for(int k=0; k<line.length(); k++) {
                if(line.charAt(k) == '>') aux++;
                else if(line.charAt(k) =='<') aux--;
            }
            
                
            cal.set(Calendar.DAY_OF_MONTH, d);
            cal.set(Calendar.MONTH, m-1);
            cal.set(Calendar.YEAR, a);
            cal.add(Calendar.DATE, aux);
            
            System.out.println(dateFormat.format(cal.getTime()));
        
            
            
        }
        
        
        
    }
    
}