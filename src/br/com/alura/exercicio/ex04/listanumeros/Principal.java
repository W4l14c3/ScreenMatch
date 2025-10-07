package br.com.alura.exercicio.ex04.listanumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Integer> listaDeNumeros = new ArrayList<>();
        listaDeNumeros.add(10);
        listaDeNumeros.add(15);
        listaDeNumeros.add(0);
        listaDeNumeros.add(25);

        System.out.println("Lista de numeros desordenada: " + listaDeNumeros);
        Collections.sort(listaDeNumeros);
        System.out.println("Lista de numeros ordenados: " + listaDeNumeros);
    }
}
