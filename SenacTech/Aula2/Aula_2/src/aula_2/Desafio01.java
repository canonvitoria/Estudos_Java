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
public class Desafio01 {
    public static void main(String[] args) {
        int n1, n2;
        double total;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número de sua potência: ");
        n1 = ler.nextInt();
        
        System.out.println("Digite o segndo número de sua potência: ");
        n2 = ler.nextInt();
        
        total = Math.pow(n1, n2);
        System.out.println("A potência dos números é de: " + total);
    }
}
