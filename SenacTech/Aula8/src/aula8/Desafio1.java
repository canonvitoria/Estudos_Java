/*
 Faça um programa que solicite o nome de um aluno e suas três notas. 
Se a nota for maior qou igual a 7, mostrar a mensagem aprovado, 
maior ou igual a 5 recuperação e menor que 5 reprovado.
O sistema deve solicitar para pessoa se ela quer sair do sistema 
com Sim ou não, Caso a pessoa escolha sim, o sistema vai solicitar um novo 
aluno e suas notas, caso a pessoa escolha não, o sistema vai finalizar.
 */
package aula8;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author mamatiolla
 */
public class Desafio1 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        String nome, opcao = "S";
        float n1,n2,n3,media;
        
        
        while ("S" .equals(opcao.toUpperCase())) { 
            //início
            
           System.out.println("Digite o nome do aluno: ");
           nome = ler.nextLine();
           
           System.out.println("Digite a primeira nota: ");
           n1 = ler.nextFloat();
           
           System.out.println("Digite a segunda nota: ");
           n2 = ler.nextFloat();
           
           System.out.println("Digite a terceira nota: ");
           n3 = ler.nextFloat();
           
           ler.skip("\\R");
                   
           media = (n1+n2+n3)/3;
           
           if ((media >= 7) && (media <= 10)) {
               
               System.out.println("O aluno " + nome + " está aprovado!");
               System.out.println("Sua nota final foi: " + media);
               
           } else {
               if ((media >= 5) && (media < 7)) {
                   
                      System.out.println("O aluno " + nome + " está em recuperação!");
                      System.out.println("Sua nota final foi: " + media);
               }else{
                   if ((media >= 0) && (media < 5)) {
                        System.out.println("O aluno " + nome + " está reprovado!");
                        System.out.println("Sua nota final foi: " + media);
                   }else{
                       System.out.println("Erro no sistema, tente novamente!");
                       
                   }                  

           }
    }
            
            System.out.println("Deseja continuar (S/N)? ");
            opcao = ler.nextLine().toUpperCase();
            
            System.out.println("######################################################");
            
            //fim
            
        }
    }
    
}
