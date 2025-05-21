package aula5;
    
 import java.util.Scanner;
            
public class Desafio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String nome;
        int idade;
        
        System.out.println("-- VERIFICAÇÃO DE IDADE --");
        
        System.out.print("Insira seu nome: ");
        nome = ler.next();
        
        System.out.print("Insira a sua idade: ");
        idade = ler.nextInt();
        
        if (idade >= 14) {
            System.out.print(nome + " , você já pode retirar sua carteira de trabalho!");
        } else {
            System.out.println(nome + " , você não pdoe tirar sua carteira de trabalho... ");
        }
    }
}
