/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

import java.util.Scanner;
/**
 *
 * @author Canon Vitória
 */
public class Exemplo3 {
    public static void main(String[] args) {
        
        //Programa que solicite o noem e sobrenome do usuário
        
        Scanner ler = new Scanner(System.in);
        String nome, sobrenome;
        
        System.out.println("Informe o seu nome: ");
        nome = ler.nextLine();
        
        System.out.println("Informe o seu sobrenome: ");
        sobrenome = ler.nextLine();
        
        System.out.println("O seu nome completo é: " + nome + " " + sobrenome);
    }
}
