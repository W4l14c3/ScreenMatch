package br.com.alura.exercicio.ex01;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Veronica", 22, 1.55, 70.00);
        Pessoa pessoa1 = new Pessoa("Geovana", 26, 1.60, 65);
        Pessoa pessoa2 = new Pessoa("Lucas", 37, 1.75,102.99);


        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa);
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);

        System.out.println("O tamanho da lista é: \n" + listaDePessoas.size());
        System.out.println("O primeiro da lista é: \n" + listaDePessoas.getFirst());
        System.out.println("Lista completa: \n" + listaDePessoas);
    }
}
