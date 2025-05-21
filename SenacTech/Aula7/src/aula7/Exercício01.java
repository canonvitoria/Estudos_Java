package aula7;

import java.util.Scanner;

public class Exercício01 {
    public static void main(String[] args) {
        // Sistema de calculadora
        
        Scanner ler = new Scanner(System.in);
        
        int n1, n2, opcao;
        float resultado = 0;
        
        System.out.print("Digite o 1° número: ");
        n1 = ler.nextInt();
        
        System.out.print("Digite o 2° número: ");
        n2 = ler.nextInt();
        
        System.out.println("-- MENU --");
        
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        
        System.out.println("Selecione uma das opções");
        opcao=ler.nextInt();
        
        switch (opcao) {
            case 1:
                resultado = n1 + n2;
                System.out.println("Resultado final da operação: " + resultado);
                break;
            case 2:
                resultado = n1 - n2;
                System.out.println("Resultado final da operação: " + resultado);
                break;
            case 3:
                resultado = n1 * n2;
                System.out.println("Resultado final da operação: " + resultado);
                break;
            case 4:
                resultado = n1 / n2;
                System.out.println("Resultado final da operação: " + resultado);
                break;
            default:
                System.out.println("Operação inválida");
        }
    }
 }