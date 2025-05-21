package aula_3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Desafio06 {
    public static void main(String[] args) {
        double preco,  revendedor, imposto, total;
        String automovel;
        
        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.println("--- TABELA DE VALORES ---");
        
        System.out.print("Digite o nome do automóvel: ");
        automovel = ler.next();
        
        System.out.print("Digite o valor do automóvel: R$");
        preco = ler.nextDouble();
        
        revendedor = preco * 0.45;
        imposto = preco * 0.28;
        total = preco + revendedor + imposto;
        
        System.out.println("O preço final do automóvel é de R$" + df.format(total));           
    }
}