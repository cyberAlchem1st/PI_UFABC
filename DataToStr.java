import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.Locale;
import java.text.DateFormatSymbols;

public class DataToStr {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
      
        
        Locale localeBR = new Locale("pt", "BR");
        DateFormat dateFormat = new SimpleDateFormat("MMMM", localeBR);
        Calendar cal = Calendar.getInstance();
        
        //System.out.println( fmt.format(new Date()) );
        
        int i=0;
        
        while(i<1) {
            
            
            
            int d = input.nextInt();
            int m = input.nextInt();
            int a = input.nextInt();
            
            cal.set(Calendar.DAY_OF_MONTH, d);
            cal.set(Calendar.MONTH, m-1);
            cal.set(Calendar.YEAR, a);
            
            String mes = dateFormat.format(cal.getTime());
            
            mes.charAt(0) = Character.toUpperCase(mes.charAt(0));
            
            System.out.println(mes);
            
            
        }
        
        
        
    }
    
}