package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso Chefão",1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var  filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item: lista){
            System.out.println(item);
            //Verifica e declara uma variavel JavaPath 14, Java path 17
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                //Vai ocorrer um erro por que lost é um objeto tipo Série e não Filme.
                System.out.println("Classificação: " + filme.getClassificacao());
            }

        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jaqueline");
        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);
        System.out.println("Lista de artistas ordenada:");
        System.out.println(buscaPorArtista);
        System.out.println("\n");

        //Comparando e ordenando filmes e series
        Collections.sort(lista);
        System.out.println("Lista de filmes ordenada.");
        System.out.println(lista);

        //Criando um novo metodo de comparação
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        /*
           O Comparator é uma ferramenta que permite que você adicione novas formas de comparação e ordenação,
           mantendo a estrutura e a lógica original da classe intactas. Isso é muito útil em programação,
           pois promove a reutilização de código e a manutenção mais fácil,
           já que você não precisa modificar a classe sempre que quiser uma nova forma de ordenação.
         */
        System.out.println(lista);
    }
}
