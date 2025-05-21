/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula8;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Senac
 */
public class Desafio2 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        double sub = 0, total = 0;
            int quantidade, picole, cont = 0; 
            String opcao = "S";
        
        
        while ("S" .equals(opcao.toUpperCase())) { 
            //início
            
                                  
           System.out.println("#### Sorveteria do sor Miguel ####");
           System.out.println(" 1- Picole de uva R$ 1,00");
           System.out.println(" 2- picole de laranja R$ 1,25");
           System.out.println(" 3- picole de milho R$ 1,50");
           System.out.print(" Selecione alguma das opções: ");
           picole = ler.nextInt();
           
                  
           System.out.print("Digite quantos picoles vc deseja comprar: ");
           quantidade = ler.nextInt();
           
           ler.skip("\\R");
           
           if (picole == 1) {
               
               sub = quantidade * 1.00;  
               total = total + sub;
               cont = cont + quantidade;
              // System.out.println("A quantidade vendida de picoles foi: " + quantidade); 
              // System.out.println("O total arrecadado foi: R$ " + df.format(total));
        } else {
               if (picole == 2) {
                   
                   sub = quantidade * 1.25; 
                   total = total + sub;
                   cont = cont + quantidade;
                   //System.out.println("A quantidade vendida de picoles foi: " + quantidade); 
                   //System.out.println("O total arrecadado foi: R$ " + df.format(total));
               } else {
                   if (picole == 3) {
                       
                       sub = quantidade * 1.50;
                       total = total + sub;
                       cont = cont + quantidade;
                       //System.out.println("A quantidade vendida de picoles foi: " + quantidade); 
                       //System.out.println("O total arrecadado foi: R$ " + df.format(total));
                   } else {
                       System.out.println("Opção inválida");
                   }
               }
        }
           
           
            
            System.out.print("Deseja continuar comprando (S/N)? ");
            opcao = ler.nextLine().toUpperCase();
            
            System.out.println("######################################################");
            
            //fim
            
        }
        System.out.println("A quantidade vendida de picoles foi: " + cont); 
          System.out.println("O total arrecadado foi: R$ " + df.format(total));
        
    }
    
}
