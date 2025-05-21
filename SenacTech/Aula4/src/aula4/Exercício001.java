package aula4;

import java.util.Scanner;

public class Exercício001 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        String nome;
        int idade;
        
        System.out.println("--- CONSULTA DE CARTEIRA DE MOTORISTA ---");
        
        System.out.print("Digite seu nome: ");
        nome = ler.nextLine();
        
        System.out.print("Digite sua idade: ");
        idade = ler.nextInt();
        
        if (idade >= 18) {
            System.out.println(nome + ", você foi aprovado(a) para realizar a carteira de motorista!!");
        } else {
            System.out.println(nome + ", sinto muito... Você não foi aprovado(a) para realizar a carteira de motorista...");
        }
        
        System.out.println("Agradecemos seu contato!!");
    }
}
