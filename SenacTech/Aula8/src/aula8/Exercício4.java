package aula8;

public class Exercício4 {
    public static void main(String[] args) {
        
        int num = 0;
        
        while (num < 100) {            
            if (num % 2 == 0) {
                System.out.println("O número " + num + " é par!!");
            } else {
                System.out.println("O número " + num + " é ímpar!!");
            }
            
            num = num + 5;
        }
    }
}
