package aula4;

import java.util.Scanner;

public class Exercício002 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner (System.in);
        
        String nome, cor;
        
        System.out.println("-- CONSULTAR CORES ---");
        
        System.out.print("Por favor, digite o sue nome: ");
        nome = ler.nextLine();
        
        System.out.print("Por favor, informe as cores corretas do Grêmio: ");
        cor = ler.nextLine();
        
        if ("azul".equalsIgnoreCase(cor)) {
            System.out.println("Parabéns!! " + nome + " , você acertou a cor.");
        } else {
            System.out.println("Você errou... Tente na próxima vez!!");
        }
    }
}
