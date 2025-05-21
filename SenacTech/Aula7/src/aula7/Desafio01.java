package aula7;

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String nome;
        double preco, resultado = 0;
        int opcao;
        
        System.out.print("Informe seu nome completo: ");
        nome = ler.nextLine();
        
        System.out.println("Informe o valor do produto: R$");
        preco = ler.nextDouble();
        
        System.out.println("-- MENU DE OFERTAS --");
        
        System.out.println("( 1 ) Venda á vista - Desconto de 10%");
        System.out.println("( 2 ) Venda a prazo (30 dias) - Desconto de 5%");
        System.out.println("( 3 ) Venda a prazo (60 dias) - Mesmo preço");
        System.out.println("( 4 ) Venda a prazo (90 dias) - acréscimo de 5%");
        System.out.println("( 5 ) Venda com cartão de débito - Desconto de 8%");
        
        System.out.println("Selecione uma das opções");
        opcao = ler.nextInt();
        
        switch (opcao) {
            case 1: 
                resultado = preco - (preco * 0.10);
                System.out.println(nome + ", você escolheu a opção 1. você deverá pagar R$" + resultado + ", com desconto de 10%");
                break;
            case 2:
                resultado = preco - (preco * 0.05);
                System.out.println(nome + ", você escolheu a opção 2. você deverá pagar R$" + resultado + ", com desconto de 5%");
                break;
            case 3: 
                resultado = preco;
                System.out.println(nome + ", você escolheu a opção 3. você deverá pagar R$" + resultado + ", mesmo valor");
                break;
            case 4:
                resultado = preco + (preco * 0.05);
                System.out.println(nome + ", você escolheu a opção 4. você deverá pagar R$" + resultado + (", com acréscimo de 5%"));
                break;
            case 5:
                resultado = preco - (preco * 0.08);
                System.out.println(nome + ", você escolheu a opção 5. você deverá pagar R$" + resultado + (", com desconto de 8%"));
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
