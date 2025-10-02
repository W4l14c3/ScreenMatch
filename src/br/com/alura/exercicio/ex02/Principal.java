package br.com.alura.exercicio.ex02;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto("SaboneteCorporal", 2.50);
        produto1.setQtdProd(10);

        Produto produto2 = new Produto("Shampoo", 4.50);
        produto2.setQtdProd(10);

        Produto produto3 = new Produto("Detergente", 4.00);
        produto3.setQtdProd(10);

        ProdutoPerecivel produtoPer = new ProdutoPerecivel("Iogurte", 1.50, "03/2026");
        produtoPer.setQtdProd(25);

        ProdutoPerecivel produtoPer1 = new ProdutoPerecivel("Leite Condensado", 4.75, "05/2026");
        produtoPer1.setQtdProd(15);


        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);
        listaDeProdutos.add(produtoPer);
        listaDeProdutos.add(produtoPer1);

        System.out.println("O tamanho atual da lista é: " + listaDeProdutos.size());
        System.out.println("Resgatando um item da lista. " + listaDeProdutos.get(4));

    }



}
