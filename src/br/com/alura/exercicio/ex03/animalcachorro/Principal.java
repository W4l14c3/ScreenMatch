package br.com.alura.exercicio.ex03.animalcachorro;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Cachorro pudo = new Cachorro();
        pudo.setNome("Pudo");
        pudo.setDieta("Onivoro");
        pudo.setTipo("Canideo");

        ArrayList<Animal> listaDeAnimas = new ArrayList<>();
        listaDeAnimas.add(pudo);

        for (Animal list: listaDeAnimas){
            if(list instanceof Cachorro){
                Animal aniCao = (Animal) pudo;
            }
        }




    }
}
