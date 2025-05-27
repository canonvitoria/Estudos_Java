import br.com.alura.screenmatch.calculos.Calculadora;
import br.com.alura.screenmatch.calculos.Recomendation;
import br.com.alura.screenmatch.modelos.Film;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Film harryPotter = new Film();
        harryPotter.setNome("Harry Potter e a Pedra Filosofal"); ;
        harryPotter.setYear(2001);
        harryPotter.setDuration(152);

        harryPotter.evaluate(10);
        harryPotter.evaluate(8);
        harryPotter.evaluate(9);

        harryPotter.showFiche();
        System.out.println("Avaliação: " + harryPotter.media());
        System.out.println("Quantidade de Avaliações: " + harryPotter.getQtsAvaliation());
        Calculadora calculadora = new Calculadora();
        calculadora.included(harryPotter);
        System.out.println("Duração: " + calculadora.getTotalTime() + " minutos");
        Recomendation filtro = new Recomendation();
        filtro.filter(harryPotter);

        System.out.println("------------------------------------");

        Serie you = new Serie();
        you.setNome("You");
        you.setYear(2018);
        you.showFiche();
        you.setSeason(5);
        you.setEpBySeason(12);
        you.setMinByEpisodes(50);
        calculadora.included(you);
    }
}
