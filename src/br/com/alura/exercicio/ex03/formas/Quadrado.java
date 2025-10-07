package br.com.alura.exercicio.ex03.formas;

public class Quadrado implements Forma{
    private String nome;
    private double altura;
    private double lado;

    public Quadrado(String nome, double altura, double lado) {
        this.nome = nome;
        this.altura = altura;
        this.lado = lado;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public double calcularArea() {
        return lado * altura;
    }
}
