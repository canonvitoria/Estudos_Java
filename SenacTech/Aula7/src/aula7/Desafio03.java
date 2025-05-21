package aula7;

import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String nome, categoria;
        double salario;
        
        System.out.println("-- MENU DE BENEFICIOS --");
        
        System.out.println("Categoria A e B - Acréscimo de 10% no salário");
        System.out.println("Categoria B, C e E - Acréscimo de 11% no salário");
        System.out.println("Categoria F, G, H, I e J - Acréscimo de 12% no salário");
        System.out.println("Categoria K - Acréscimo de 13% no salário");
        
        System.out.println("Informe a categoria de aumento do salário do funcionário");
        categoria = ler.nextLine();
    }
}