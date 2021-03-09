import java.util.Scanner;


public class Cedulas {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int dim = n;
        
        int cem = n/100;
        if(cem > 0) {
            n = n%100;
        }
        
        int cinquenta = n/50;
        if(cinquenta > 0) {
            n = n%50;
        }
        
        int vinte = n/20;
        
        if(vinte > 0) {
            n = n%20;
        }
        
        int dez = n/10;
        
        if(dez > 0) {
            n = n%10;
        }
        
        int cinco = n/5;
        
        if(cinco > 0) {
            n = n%5;
        }
        
        int dois = n/2;
        
        if(dois > 0) {
            n = n%2;
        }
        
        int um = n/1;
        
        if(um > 0) {
            n = n%1;
        }
        
        
        System.out.println("R$" + dim + ".00");
        System.out.println(cem + " nota(s) de R$100.00");
        System.out.println(cinquenta + " nota(s) de R$50.00");
        System.out.println(vinte + " nota(s) de R$20.00");
        System.out.println(dez + " nota(s) de R$10.00");
        System.out.println(cinco + " nota(s) de R$5.00");
        System.out.println(dois + " nota(s) de R$2.00");
        System.out.println(um + " nota(s) de R$1.00");
        
        
    }
}