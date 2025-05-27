package br.com.alura.screenmatch.modelos;
import br.com.alura.screenmatch.calculos.Classification;

public class Film extends Title implements Classification {
  private  String diretor ;

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
}
