import java.util.*;
import java.lang.*;
import java.io.*;


public class Pangrama {
    public static boolean ehPangrama(String a) {
        int aux = 0;
        String b = a.toUpperCase();
        char alfabeto[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

        int i = 0;

        while(i<26) {

            for(int j=0; j<b.length(); j++) {
                if(alfabeto[i] == b.charAt(j)) {
                    aux++;
                    break;
                }
            }

            i++;
        }
        if(aux >= 26) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(input.hasNext()) {
            String phrase = input.nextLine();

            if(ehPangrama(phrase)) System.out.println("sim");
            else System.out.println("nao");
        }
    }
}