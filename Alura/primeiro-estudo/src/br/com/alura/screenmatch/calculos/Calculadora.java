package br.com.alura.screenmatch.calculos;
import br.com.alura.screenmatch.modelos.Title;

public class Calculadora {
    private int totalTime;

    public int getTotalTime() {
        return this.totalTime;
    }

//    public void included(Film f){
//        this.totalTime += f.getDuration();
//    }
//
//    public void included(Serie f){
//        this.totalTime += f.getDuration();

    public void included(Title titulo){
        this.totalTime =+ titulo.getDuration();
    }
}
