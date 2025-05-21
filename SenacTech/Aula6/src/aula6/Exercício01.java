package aula6;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercício01 {
    public static void main(String[] args) {
        Double n1, n2, n3, n4, n5, media;
        
        String nome;
        
        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat ("0.00");
        
        System.out.println("-- SISTEMAS DE NOTAS --");
        
        System.out.print("Insira o nome do aluno: ");
        nome = ler.next();
        
        System.out.print("Insira a 1° nota: ");
        n1 = ler.nextDouble();
        
        System.out.print("Insira a 2° nota: ");
        n2 = ler.nextDouble();
        
        System.out.print("Insira a 3° nota: ");
        n3 = ler.nextDouble();
        
        System.out.print("Insira a 4° nota: ");
        n4 = ler.nextDouble();
        
        System.out.print("Insira 5° nota: ");
        n5 = ler.nextDouble();
        
        media = (n1 + n2 + n3 + n4 + n5) / 5;
        
        if (media >= 7) {
            System.out.println("PARABÉNS!!! " + nome + ", você foi aprovado!!");
        } else {
            if (media >= 5 ) {
                System.out.println("Você recebeu mais uma chance, está de recuperação.");
            } else {
                System.out.println("Sinto muito... Você está reprovado(a)...");
            }
        }
    }
    
}
