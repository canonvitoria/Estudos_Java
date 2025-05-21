package aula9;

import java.util.Scanner;

public class Exercício1 {
    public static void main(String[] args) {
        // Trabalhando com laço de repetição FOR
        
        int cont1 = 0, cont2 = 0, i;
        
        Scanner ler = new Scanner(System.in);
        
        for(i = 1; i < 10; i++) {
            System.out.println("O valor da variável i é: " + i);
            cont1 = cont1 + 1;
        }
        
        System.out.println("O total de números impressos foi: " + cont1);
        System.out.println("------------------------------------------");
        
        for(i = 10; i >= 1; i--) {
            System.out.println("O valor da variável i é: " + i);
            cont2 = cont2 + 1;
        }
        System.out.println("O total de números impressos foi: " + cont2);
    }
    
}
