public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: Top Gun: Maverick");

        // Tipo Primitivos
        int year = 2022;
        System.out.println("Ano de lançamento: " + year);

        boolean includedPlan = false;
        System.out.println("Incluído no plano: " + includedPlan);

        double note = 8.1;

        // Calculos
        double media = (9.8 + 6.3 + 8) / 3;
        //System.out.println("Media de Notas: " + media);

        String sinopse = """
                Filme de aventura com galã dos anos 80""";
        System.out.println("Sinopse:" + sinopse);

        int classification = (int) (media / 2);
        System.out.println("Classificação: " + classification + " estrelas");
    }
}
