import java.util.*;
import java.lang.*;



public class java {
    public static void main(String args[]) {
        Locale.setDefault(new Locale("pt", "BR"));

        Scanner input = new Scanner(System.in);

        int in = -1;

        while(in != 1331) {
            System.out.println("Operação a ser feita: \n (1: Soma 2: Multiplicação 3: Subtração 4: Divisão\n 1331 para encerrar\n");

            in = input.nextInt();

            System.out.print("Numero 1: ");
            double a = input.nextDouble();
            System.out.println();

            System.out.println("Numero 2: ");
            double b = input.nextDouble();
            System.out.println();

            if(in == 1) System.out.print("Resultado: " + (a+b));
            else if(in == 2) System.out.print("Resultado: " + (a*b));
            else if(in == 3) System.out.print("Resultado: " + (a/b));
            else if(in == 4) System.out.print("Resultado: " + (a-b));

            else if(in != 1331) System.out.println("Operação invalida");

        }

    }
}
