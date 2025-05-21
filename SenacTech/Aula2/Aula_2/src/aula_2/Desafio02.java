/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_2;

import java.util.Scanner;

/**
 *
 * @author Canon Vitória
 */
public class Desafio02 {
    public static void main(String[] args) {
        // Sistema de Notas
        double n1, n2, n3, n4, n5, media;
        String nome;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("--- SISTEMA DE NOTAS ---");
        
        System.out.println("Digite o nome do aluno(a): ");
        nome = ler.nextLine();
      
        System.out.println("Digite a primeira nota do aluno(a): ");
        n1 = ler.nextDouble();
        
        System.out.println("Digite a segunda nota do aluno(a): ");
        n2 = ler.nextDouble();
        
        System.out.println("Digite a terceira nota do aluno(a)");
        n3 = ler.nextDouble();
        
        System.out.println("Digite a quarta nota do aluno(a): ");
        n4 = ler.nextDouble();
        
        System.out.println("Digite a quinta e última nota do aluno(a): ");
        n5 = ler.nextDouble();
        
        media = (n1 + n2 + n3 + n4 + n5) / 5;
        
        System.out.println("A média do(a) aluno(a) " + nome + " é de: " + media);
    }
}
