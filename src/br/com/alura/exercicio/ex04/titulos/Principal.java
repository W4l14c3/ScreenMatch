package br.com.alura.exercicio.ex04.titulos;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Titulo titulo1 = new Titulo("Plug in Baby", 1999);
        Titulo titulo2 = new Titulo("Offline-first: o mundo da baixa conectividade – Hipsters Ponto Tech ", 2025);
        Titulo titulo3 = new Titulo("Clojure e Datomic no Nubank – Hipsters Ponto Tech ", 2025);
        Titulo titulo4 = new Titulo("Vibe Coding – Hipsters Ponto Tech", 2025);

        List<Titulo> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add(titulo1);
        listaPolimorfica.add(titulo2);
        System.out.println("\nArrayList de titulos: \n" + listaPolimorfica);


        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add(titulo3);
        listaPolimorfica.add(titulo4);
        System.out.println("\nLinkedList de titulos: \n" + listaPolimorfica);


    }

}
