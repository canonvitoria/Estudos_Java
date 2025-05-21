package aula5;

import java.util.Scanner;
        
public class Exercicio1 {

    public static void main(String[] args) {
        //Sistema para informar se o núemro será par ou ímpar
        
        Scanner ler = new Scanner(System.in);
        
        int valor;
        
        System.out.println("--- TESTE DE NÚMERS ---");
        
        System.out.print("Informe um número interio: ");
        valor = ler.nextInt();
        
        if (valor % 2 == 0) {
            System.out.println("O número informado é PAR!!");
        } else {
            System.out.println("O número informado é ÍMPAR!!");
        }
    }
    
}
