/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_2;

import java.util.Scanner;
import java.text.DecimalFormat; 

/**
 *
 * @author Canon Vitória
 */
public class Desafio03 {
    public static void main(String[] args) {
        double dolar, cotacao, reais;
        
        Scanner ler = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat("0.00"); 
        
        System.out.println("Digite o valor que você tem em dólar: ");
        dolar = ler.nextDouble();
        
        System.out.println("Digite a cotação do dólar atual: ");
        cotacao = ler.nextDouble();
        
        reais = dolar * cotacao;
        //System.out.println("Você terá o total de R$" + reais);
        System.out.println("Você terá o total de R$ "+ df.format(reais));
    }
}
