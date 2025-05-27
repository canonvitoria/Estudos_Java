package br.com.alura.screenmatch.calculos;

public class Recomendation {
    public void filter(Classification classication) {
        if (classication.getClassification() >= 4){
            System.out.println("Está entre os preferidos da galera!");
        } else if (classication.getClassification() >= 2) {
            System.out.println("Muito bem avaliado!");
        } else {
            System.out.println("Assista depois!");
        }
    }
}
