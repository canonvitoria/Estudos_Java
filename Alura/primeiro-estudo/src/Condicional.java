public class Condicional {
    public static void main(String[] args) {
        int year = 2022;
        boolean includedPlan = false;
        double note = 8.1;
        String plan = "Normal";

        if (year >= 2022) {
            System.out.println("Lançamento Recente");
        } else {
            System.out.println("Filme Retrô");
        }

        if (includedPlan || plan.equals("Plus")) {
            System.out.println("Filme liberado!");
        } else {
            System.out.println("Valor de locação: R$ 19,99");
        }
    }
}
