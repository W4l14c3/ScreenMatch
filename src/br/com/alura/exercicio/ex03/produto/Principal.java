package br.com.alura.exercicio.ex03.produto;

import java.util.ArrayList;


public class Principal {

    public static void main(String[] args) {
        double precoTotal = 0;
        Produto produto1 = new Produto("Leite", 2.50);
        Produto produto2 = new Produto("Maizena", 7.90);
        Produto produto3 = new Produto("Sorvete", 21.50);

        ArrayList<Produto> items = new ArrayList<>();
        items.add(produto1);
        items.add(produto2);
        items.add(produto3);

        for (Produto item : items) {
            precoTotal += item.getPreco();
        }
        precoTotal = precoTotal / items.size();
        System.out.println("O preço médio do items é " + Math.ceil(precoTotal));

    }
}
