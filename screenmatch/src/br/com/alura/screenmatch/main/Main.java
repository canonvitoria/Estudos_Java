package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.calculos.Calculadora;
import br.com.alura.screenmatch.calculos.Recomendation;
import br.com.alura.screenmatch.modelos.Film;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Film filme1 = new Film("Harry Potter e a Pedra Filosofal", 2001);
        filme1.setDuration(152);
        filme1.evaluate(10);
        filme1.showFiche();
        System.out.println("Avaliação: " + filme1.media());
        System.out.println("Quantidade de Avaliações: " + filme1.getQtsAvaliation());
        Calculadora calculadora = new Calculadora();
        calculadora.included(filme1);
        System.out.println("Duração: " + calculadora.getTotalTime() + " minutos");
        Recomendation filtro = new Recomendation();
        filtro.filter(filme1);

        System.out.println("------------------------------------");

        Serie you = new Serie("You", 2018);
        you.showFiche();
        you.setSeason(5);
        you.setEpBySeason(12);
        you.setMinByEpisodes(50);
        calculadora.included(you);

        System.out.println("------------------------------------");

        var filme2 = new Film("Harry Potter e a Câmara Secreta", 2002);
        filme2.setDuration(161);
        filme2.evaluate(9);
        List<Film> saga = new LinkedList<> ();
        saga.add(filme1);
        saga.add(filme2);
        System.out.println("Quantidade de filmes da Saga: " + saga.size());
        System.out.println("Primeiro filme: " + saga.getFirst().getNome());
    }
}
