package aula7;

import java.util.Scanner;

public class Exercicio02 {
       public static void main(String[] args) {
        
           Scanner ler = new Scanner(System.in);
           
           int n1, n2;
           float resultado = 0;
           String operacao;
           
           System.out.print("Digite o 1° número: ");
           n1 = ler.nextInt();
           
           ler.skip("\\R");
           
           System.out.print("Digite a operação matemática (+ - * /): ");
           operacao = ler.nextLine();
           
           System.out.print("Digite o 2° número: ");
           n2 = ler.nextInt();
           
           System.out.println("-- Resultado da operação --");
           
           switch (operacao) {
               case "+":
                   resultado = n1 + n2;
                   System.out.println("O resultado da operação é: " + resultado);
                   break;
               case "-":
                   resultado = n1 - n2;
                   System.out.println("O resultado da operação é: " + resultado);
                   break;
               case "*":
                   resultado = n1 * n2;
                   System.out.println("O resultado da operação é: " + resultado);
                   break;
               case "/":
                   resultado = n1 / n2;
                   System.out.println("O resultado da operação é: " + resultado);
                   break;
               default:
           }
    }
}
