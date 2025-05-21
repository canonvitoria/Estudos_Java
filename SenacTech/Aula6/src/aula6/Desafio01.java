package aula6;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Desafio01 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        double total;
        int quantidade, opcao;
        
        System.out.println("-- VENDA DE PICOLÉS --");
        
        System.out.println("       ");
        
        System.out.print("Quantos picolés você deseja comprar: ");
        quantidade = ler.nextInt();
        
        System.out.println("SABORES");
        
        System.out.println("       ");
        
        System.out.println("1 - Uva (R$ 1,00)");
        System.out.println("2 - Laranja (R$ 1,25)");
        System.out.println("3 - Milho (R$ 1,50");
        
        System.out.println("        ");
        
        System.out.print("Selecione o sabor que você deseja comprar");
        opcao = ler.nextInt();
                
        if (opcao == 1 ) {
            total = quantidade;
            System.out.println("O total da sua compra foi de R$" + df.format(total));
        } else {
            if (opcao == 2) {
                total = quantidade * 1.25;
                System.out.println("O total da sua compra foi de R$" + df.format(total));
            } else {
                if (opcao == 3) {
                    total = quantidade * 1.50;
                    System.out.println("O total da sua compra foi de R$" + df.format(total));
                } else {
                    System.out.println("Valor inválido!! informa o sabor exato.");
                }
            }
        }
    }
}
