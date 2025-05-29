package br.com.alura.screenmatch.modelos;

public class Serie extends Title {
    private int season;
    private int epBySeason;
    private boolean active;
    private int minByEpisodes;

    public Serie(String nome, int year) {
        super(nome, year);
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getEpBySeason() {
        return epBySeason;
    }

    public void setEpBySeason(int epBySeason) {
        this.epBySeason = epBySeason;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getMinByEpisodes() {
        return minByEpisodes;
    }

    public void setMinByEpisodes(int minByEpisodes) {
        this.minByEpisodes = minByEpisodes;
    }

    @Override
    public int getDuration() {
        return season * epBySeason * minByEpisodes;
    }

    @Override
    public String toString() {
        return "Série: " + this.getNome() + "- (" + this.getYear() + ")";
    }

    @Override
    public int compareTo(Title otherTitle) {
        return this.getNome().compareTo(otherTitle.getNome());
    }
}
