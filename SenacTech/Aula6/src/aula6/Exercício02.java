package aula6;

import java.util.Scanner;

public class Exercício02 {
    public static void main(String[] args) {
        // Calculadora no JAVA
        
        Scanner ler  = new Scanner(System.in);
        
        int n1, n2, opcao;
        float resultado = 0;
        
        
        System.out.println("Calculadora no JAVA");
        
        System.out.print("Digite o 1° valor: ");
        n1 = ler.nextInt();
        
        System.out.print("Digite o 2° valor: ");
        n2 = ler.nextInt();
        
        System.out.println("                                ");
        
        System.out.println("--Menu de operações matemáticas--");
        
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        
        System.out.println("           ");
        
        System.out.println("Selecione uma das opções");
        opcao = ler.nextInt();
        
        System.out.println("              ");
        
        if (opcao == 1 ) {
            resultado = n1 + n2;
            System.out.println("O resultado é " + resultado);
        } else {
            
                if (opcao == 2 ) {
                    resultado = n1 - n2;
                    System.out.println("O resultado é " + resultado);
                    
                } else {
                    
                        if (opcao == 3) {
                        resultado = n1 * n2;
                        System.out.println("O resultado é " + resultado);
                        
                            } else {
                            
                                if (opcao == 4) {
                                resultado = n1 / n2;
                                System.out.println("O resultado é " + resultado);  
                        
                                    } else {
                                    System.out.println("Opção inválida!! Por favor, digite uma das opções");
                    }
                }        
            }
        }
    }
}


