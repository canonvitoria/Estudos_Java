package aula5;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Desafio3 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        int quantidade, valor, total;
        
        System.out.println("-- BOLOS E TORNTAS --");
        
        System.out.print("Qual é a quantidade de bolos que você gostaria de comprar? ");
        quantidade = ler.nextInt();
        
        if (quantidade < 5) {
            valor = 50;
            total = valor * quantidade;
            System.out.println("O valor total de " + quantidade + " bolos é de R$" + df.format(total));
        } else {
            valor = 40;
            total = valor * quantidade;
            System.out.println("O valor total de " + quantidade + " bolos é de R$" + df.format(total));
        }   
    }
}
