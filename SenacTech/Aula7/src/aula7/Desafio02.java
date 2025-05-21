package aula7;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String conceito, nome;
        
        System.out.println("-- SISTEMA DE NOTAS --");
        
        System.out.print("Digite o seu nome completo: ");
        nome = ler.nextLine();
        
        System.out.println("Digite o seu Conceito Final: ");
        conceito = ler.nextLine();
        
        switch (conceito.toUpperCase()) {
            case "A":
                System.out.println("Seu conceito final foi A, e foi aprovado com o maior conceito!!");
                break;
            case "B":
                System.out.println("Seu conceito conceito final foi B, e foi aprovado com um ótimo conceito!");
                break;
            case "C":
                System.err.println("Seu conceito final foi C, e está de recuperação!");
                break;
            case "D":
                System.out.println("Seu conceito final D, e está reprovado!");
                break;
            default:
                System.out.println("Erro no sistema, tente novamente!");
        }
       
    }
 
}
