package aula4;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Desafio07 {
    public static void main(String[] args) {
        
        double custo, acrescimo, venda, total;
        String produto;
        
        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.println("--- VENDA SENAC FELIZ <3");
        
        System.out.print("Digite o nome do produto: ");
        produto = ler.next();
        
        System.out.print("Digite o custo: R$");
        custo = ler.nextDouble();
        
        System.out.print("Digite o acréscimo do produto: %");
        acrescimo = ler.nextDouble();
        
        venda = acrescimo / 100 + custo;
        //vena = custo + (custo * (acrescimo / 100));
                
        System.out.println("O produto: " + produto + ", irá receber o valor de R$" + df.format(venda) + " para venda");
    }
    
}
