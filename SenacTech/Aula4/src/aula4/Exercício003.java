package aula4;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercício003 {
    public static void main(String[] args) {
        
         Scanner ler = new Scanner(System.in);
         DecimalFormat df = new DecimalFormat("0.00");
         
         int quantidade;
         double valor, total;
         
         System.out.println("--- TRAKINAS ---");
         
         System.out.print("Quantas Trakinas você gostaria de comprar: ");
         quantidade = ler.nextInt();
         
        if (quantidade > 11) {
           valor = 0.40;
           total = quantidade * valor;
           System.out.println("Você comprou " + quantidade + " Trakinas, o valor total da sua compra foi de: R$" + df.format(total));
        } else {
           valor = 0.50;
           total = quantidade * valor;
           System.out.println("Você comprou " + quantidade + " Trakinas, o valor total da sua compra foi de: R$" + df.format(total));
        }
    }
}
