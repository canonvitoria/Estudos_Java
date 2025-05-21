package aula_3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Desafio05 {
    public static void main(String[] args) {
        double prestacao, juros, total, taxa;
        int dias;
        
        Scanner ler = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.println("--- CONSULTA DE COBRANÇAS ---");
        
        System.out.print("Digite o valor de sua prestação: R$");
        prestacao = ler.nextDouble();
        
        System.out.print("Digite os dias em atraso: ");
        dias = ler.nextInt();
        
        System.out.print("Digite a taxa de juros mensal: ");
        juros = ler.nextDouble();
        
        taxa = (juros / 30) / 100;
        total = prestacao + juros;
        
        System.out.println("O valor total de sua prestação agora é: R$" + df.format(total));
        System.out.println("O juros cobrado for de: R$" + df.format(juros));
    }
}
