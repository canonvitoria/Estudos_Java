import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in); //como se fosse int(input
        double assessment = 0;
        double note = 0;
        int totalNote = 0;

//        for (int i = 0; i < 3; i++) {
//            System.out.println("Diga sua avaliação do filme (0 a 10): ");
//            note = leitura.nextDouble();
//            // assessment = assessment + note;
//            assessment += note;
//        }

        while (note != -1) {
            System.out.println("Diga sua avaliação do filme (0 a 10) ou -1 para encerrar: ");
            note = leitura.nextDouble();

            if (note != -1) {
                // assessment = assessment + note;
                assessment += note;
                totalNote ++;
            }
        }

        System.out.println("Classificação: "  + assessment / totalNote);


    }
}
