package aula6;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String nome;
        
        System.out.println("Informe qual dos veículos da lista você acha mais atraente:");
        
        System.out.print("Fusca, Opala, Ferrari ou Porsche: ");
        nome = ler.next();
        
        if (("FUSCA".equals(nome.toUpperCase())) || ("OPALA".equals(nome.toUpperCase()))) {
            System.out.println("Você prefere carros mais antigos!!");
        } else {
            if (("FERRARI".equals(nome.toUpperCase())) || ("PORSCHE".equals(nome.toUpperCase()))) {
                System.out.println("Você prefere carros mais atuais!!");
            } else {
                System.out.println("Você informou um carro não listado... Por favor indique um carro da lista!SS");
            }
        }
    }
    
}
