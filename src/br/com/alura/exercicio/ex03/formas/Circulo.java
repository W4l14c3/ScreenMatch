package br.com.alura.exercicio.ex03.formas;

public class Circulo implements Forma{
    private String nome;
    private double raio;

    public Circulo(String nome, double raio) {
        this.nome = nome;
        this.raio = raio;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
