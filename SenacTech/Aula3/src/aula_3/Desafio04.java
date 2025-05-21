/*Faça um porgrama que leia o valor de uma prestação digitada e a quantidade de dias que a prestação está vencida. Ao final, mostre o total da presatção com a taxa de juros de 2% ao dia de atraso e o jutos cobrado.*/

package aula_3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Desafio04 {
    public static void main(String[] args) {
        double prestacao, juros, total;
        int dias;
        
        Scanner ler = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat(" 0.00");
        
        System.out.println("--- CONSULTE OS VALORES ---");
        
        System.out.println("Digite o valor da sua prestação atual: ");
        prestacao = ler.nextDouble();
        
        System.out.println("Digite os dias em atraso: ");
        dias = ler.nextInt();
        
        total = prestacao + ((prestacao * 0.02) * dias);
        juros = total - prestacao;
        System.out.println("O valor de sua prestação com os dias de atraso é de: " + total);
    }
}
