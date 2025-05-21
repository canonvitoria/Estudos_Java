import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in); //como se fosse int(input

        System.out.println("Digite seu filme favorito: ");
        String film  = leitura.nextLine();

        System.out.println("Qual é o ano desse filme? ");
        int year = leitura.nextInt();

        System.out.println("Diga sua avaliação do filme (0 a 10): ");
        double assessment = leitura.nextDouble();

        System.out.println(film);
        System.out.println(year);
        System.out.println(assessment);

    }
}
