package br.com.alura.exercicio.ex01;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public Pessoa(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return """
                Nome: %s
                Idade: %d
                Altura: %.2f
                Peso: %.2f
                \n""".formatted(nome, idade, altura, peso);
    }
}
