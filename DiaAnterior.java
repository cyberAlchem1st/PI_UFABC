import java.util.*;
import java.lang.*;

public class DiaAnterior {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int d = input.nextInt();
        int m = input.nextInt();
        int a = input.nextInt();

        boolean bissexto;


		if(a%400 == 0) bissexto = true;
		else if(a%4 == 0 && a%100 != 0) bissexto = true;
		else bissexto = false;

		if(bissexto == true && m == 3 && d == 1) {
		    d = 29;
		    m--;
		}

		else if(bissexto == false && m == 3 && d == 1) {
			d = 28;
		    m--;
		}

		else if((m==5 || m == 7 || m == 10 || m == 12) && d == 1) {
		    d = 30;
		    m--;
		}

		else if((m==2 || m == 4 || m == 6 || m == 8 || m == 9 || m == 11)  && d == 1) {
	    d = 31;
	    m--;
		}

		else if(m == 1 && d == 1) {
		    d = 31;
		    m = 12;
		    a--;
		}

		else d--;

		System.out.println(d + " " + m + " " + a);


    }
}