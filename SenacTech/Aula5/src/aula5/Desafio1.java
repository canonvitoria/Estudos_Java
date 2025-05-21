package aula5;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Desafio1 {
    public static void main(String[] args) {
        //Faça um programa que solicite o NOME do aluno e suas 5 NOTAS.
        //Ao final, mostre o nome do aluno, suas 5 notas e a média final.
        //Caso a média final seja menor que 7, mostrar uam mensagem de reprovado, se for maior ou igual a 7, mostrar a mensagem aprovado.
        
        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        String nome;
        double n1, n2, n3, n4, n5, media;
        
        System.out.println("-- SISTEMAS DE NOTAS --");
        
        System.out.print("Informe o nome do aluno: ");
        nome = ler.next();
        
        System.out.print("Informe a primeira nota do aluno: ");
        n1 = ler.nextDouble();
        
        System.out.print("Informe a segunda nota do aluno: ");
        n2 = ler.nextDouble();
        
        System.out.print("Informe a terceira nota do aluno: ");
        n3 = ler.nextDouble();
        
        System.out.print("Informe a quarta nota do aluno: ");
        n4 = ler.nextDouble();
        
        System.out.print("Informe a quinta nota do aluno: ");
        n5 = ler.nextDouble();
        
        media = (n1 + n2 + n3 + n4 + n5) / 5;
        
        if (media >= 7 ) {
            System.out.println("PARABÉNS!!!!" + nome + " você foi aprovado com média " + media);
        } else {
             System.out.println("Sinto muito... Você doi reprovado :(, sua média foi de " + media);
        }
   }
}
