package aula5;

import java.util.Scanner;
        
public class Desafio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int n1, n2, total;
        
        System.out.println("-- VERIFICAÇÃO DOS NÚMEROS --");
        
        System.out.print("Insira o 1° número inteiro: ");
        n1 = ler.nextInt();
        
        System.out.print("Insira o 2° número inteiro: ");
        n2 = ler.nextInt();
        
        total = n1 + n2;
        
        if (total % 2 == 0) {
            System.out.println("A soma de " + n1 + " + " + n2 + " é " + total);
            System.out.println("O total " + total + " é um número PAR.");
        } else {
            System.out.println("A soma de " + n1 + " + " + n2 + " é de " + total);
            System.out.println("O total " + total + " é um número ÍMPAR.");
        }
    }
}
