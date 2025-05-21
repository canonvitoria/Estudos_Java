package aula8;

public class Exercício3 {
    public static void main(String[] args) {
        int num = 6;
        
        while (num < 60 ) {            
            if (num  % 2 == 0) {
                System.out.println("O número " + num + " é par!!");
            }
            
            num = num + 3;
        }
    }
}
