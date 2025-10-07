package br.com.alura.exercicio.ex03.animalcachorro;

public class Cachorro extends Animal{
    private String som;
    private boolean abanandoRabo;

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public boolean isAbanandoRabo() {
        return abanandoRabo;
    }

    public void setAbanandoRabo(boolean abanandoRabo) {
        this.abanandoRabo = abanandoRabo;
    }
}
