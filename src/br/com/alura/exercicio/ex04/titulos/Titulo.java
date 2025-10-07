package br.com.alura.exercicio.ex04.titulos;

public class Titulo implements Comparable<Titulo>{
    private String nome;
    private int ano;

    public Titulo(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "\nTitulo: " + getNome() + "Ano: " + getAno();
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
