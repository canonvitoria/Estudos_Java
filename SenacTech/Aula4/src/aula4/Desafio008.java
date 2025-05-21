package aula4;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Desafio008 {
    public static void main(String[] args) {
        
        double preco, desconto, venda;
        String produto;
        
        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.println("--- DESCONTOS SENAC FELIZ <3 ---");
        
        System.out.print("Digite o nome do produto: ");
        produto = ler.next();
        
        System.out.print("Digite o preco do produto: R$");
        preco = ler.nextDouble();
        
        System.out.print("Digite o desconto: %");
        desconto = ler.nextDouble();
        
        venda = preco - (preco * (desconto / 100));
        System.out.println("O produto: " + produto + ", terá o valor de: R$" + df.format(venda));
    }
}
