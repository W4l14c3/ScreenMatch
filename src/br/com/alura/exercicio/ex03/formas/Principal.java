package br.com.alura.exercicio.ex03.formas;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Circulo circulo1 = new Circulo("Roda", 14);
        Quadrado quadrado1 = new Quadrado("QuadradoRetangulo", 7,10);
        Quadrado retangulo = new Quadrado("Retangulo", 5, 25);

        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(circulo1);
        formas.add(quadrado1);
        formas.add(retangulo);

        for (Forma planos : formas){
            if(planos instanceof Circulo circulo){
                System.out.println(circulo.getNome() + " Raio: " + Math.round(circulo.calcularArea()));
            }
            else if(planos instanceof Quadrado quadrado){
                System.out.println(quadrado.getNome() + " Área: " + quadrado.calcularArea());
            }
        }
    }
}
