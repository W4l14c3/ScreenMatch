package br.com.alura.exercicio.ex02;

public class Produto {
    private String nome;
    private double preco;
    private int qtdProd;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtdProd() {
        return qtdProd;
    }

    public void setQtdProd(int qtdProd) {
        this.qtdProd = qtdProd;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }


}
