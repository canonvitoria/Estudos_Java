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
public class Exemplo_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Sistema de somatória de dois valores 
        
        int n1, n2;
        double total;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número inteiro: ");
        n1 = ler.nextInt();
        
        System.out.print("Digite o segundi número inteiro: ");
        n2 = ler.nextInt();
        
        total = n1 + n2; 
        System.out.println("A soma dos valores inseridos são: " + total);
        
        total = n1 - n2;
        System.out.println("A subtração dos valores inseridos são: " + total);
        
        total = n1 * n2;
        System.out.println("A multiplicação dos valores inseridos são: " + total);
        
        total = n1 / n2;
        System.out.println("A divisão dos valores inseridos são: " + total);
    }
    
}
