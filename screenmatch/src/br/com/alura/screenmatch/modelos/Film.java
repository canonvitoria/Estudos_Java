package br.com.alura.screenmatch.modelos;
import br.com.alura.screenmatch.calculos.Classification;

public class Film extends Title implements Classification {
  private  String diretor ;

    public Film(String nome, int year) {
        super(nome, year);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassification() {
        return (int) media() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getYear() + ")";
    }

    @Override
    public int compareTo(Title otherTitle) {
        return this.getNome().compareTo(otherTitle.getNome());
    }
}
