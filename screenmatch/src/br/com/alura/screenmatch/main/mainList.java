package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.modelos.Film;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Title;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class mainList {
    public static void main(String[] args) {
        Film filme1 = new Film("Harry Potter e a Pedra Filosofal -", 2001);
        filme1.evaluate(10);

        var filme2 = new Film("Harry Potter e a Câmara Secreta -", 2002);
        filme2.evaluate(9);

        Serie you = new Serie("You", 2018);
        you.evaluate(8);

        ArrayList<Title> list = new ArrayList<>();
        list.add(filme1);
        list.add(filme2);
        list.add(you);

        for (Title item: list) {
            System.out.println(item.getNome());
            if (item instanceof Film film) {
                System.out.println("Classificação: " + film.getClassification());
                System.out.println("------------------------------------");
            }
        }

        Collections.sort(list);
        list.sort(Comparator.comparing(Title::getYear));
        System.out.println(list);

//        ArrayList<String> searchActor = new ArrayList<>();
//        searchActor.add("Adam Sandler");
//        searchActor.add("Bella Ransey");
//        searchActor.add("Pedro Pascal");
    }
}
