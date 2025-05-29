package br.com.alura.screenmatch.modelos;

public abstract class Title implements Comparable<Title> {
    // "todo filme tem", por isso não tem o main
    private String nome;
    private int year;
    private boolean includedPlan;
    private double avaliation;
    private int qtsAvaliation;
    private int duration;

    public Title(String nome, int year) {
        this.nome = nome;
        this.year = year;
    }

    public int getQtsAvaliation () {
        return qtsAvaliation;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getNome() {
        return nome;
    }

    public int getYear() {
        return year;
    }

    // método
    public void showFiche () {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + year);
    }

    public void evaluate (double note) {
        avaliation += note;
        qtsAvaliation++;
    }

    public double media() {
        return avaliation / qtsAvaliation;
    }

    public int getDuration() {
        return duration;
    }
}
