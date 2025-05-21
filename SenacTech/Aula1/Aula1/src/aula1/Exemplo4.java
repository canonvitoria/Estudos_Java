package aula1;

import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        
        // Sistema de Cadastro Completo
        
        Scanner ler = new Scanner(System.in);
        
        String nome, sobrenome, endereco, bairro, cidade, estado;
        int idade, numero;
        long cpf, rg;
        
        System.out.println("Informe o seu nome: ");
        nome = ler.nextLine();
        
        System.out.println("Informe o seu sobrenome: ");
        sobrenome = ler.nextLine();
        
        System.out.println("Informe a sua idade: ");
        idade = ler.nextInt();
        
        System.out.println("Informe o seu RG: ");
        rg = ler.nextLong();
        
        System.out.println("Informe seu CPF: ");
        cpf = ler.nextLong();
        ler.skip("\\R"); // \R representa um separador de linha
        
        System.out.println("Informe seu endereço: ");
        endereco = ler.nextLine();
        
        System.out.println("Informe o bairro onde você mora: ");
        bairro = ler.nextLine();
        
        System.out.println("Informe a cidade onde você mora: ");
        cidade = ler.nextLine();
        
        System.out.println("Informe o estado onde vocÊ mora: ");
        estado = ler.nextLine();
        
        System.out.println("-------------------------");
        System.out.println("SEU DADOS PESSOAIS");
        
        System.out.println("Seu nome completo é: " + nome + " " + sobrenome);
        System.out.println("Sua idade é? " + idade + "anos");
        System.out.println("Seu CPF: " + cpf);
        System.out.println("Seu RG: " + rg);
        System.out.println("Seu endereço: " + endereco + ", no bairro: " + bairro + ", no cidade de " + cidade + ", no estado de " + estado);
    }
}
