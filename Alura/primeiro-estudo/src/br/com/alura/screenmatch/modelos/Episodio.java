package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classification;

public class Episodio implements Classification {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalReviews;

    public int getTotalReviews() {
        return totalReviews;
    }

    public void setTotalReviews(int totalReviews) {
        this.totalReviews = totalReviews;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassification() {
        if (totalReviews > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
