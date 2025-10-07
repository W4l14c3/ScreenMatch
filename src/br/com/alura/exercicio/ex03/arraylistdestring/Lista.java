package br.com.alura.exercicio.ex03.arraylistdestring;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Wallace");
        nomes.add("Veronica");
        nomes.add("Gustavo");
        nomes.add("Brunin");
        nomes.add("...");

        for (String lista : nomes){
            System.out.println(lista);
        }
    }
}
