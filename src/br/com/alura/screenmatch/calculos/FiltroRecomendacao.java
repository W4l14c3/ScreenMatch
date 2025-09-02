package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {
    private String recomendacao;

    ///Este metodo vai usar a interface {@linkplain Classificavel classificavel} para avaliar a classificação e exibir
    ///uma mensagem correspondente.
    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificacao() >= 4){
            System.out.println("Está entre os preferidos do momento.");
        }
        else if (classificavel.getClassificacao() >= 2){
            System.out.println("Muito bem avaliado no momento.");
        }
        else {
            System.out.println("Coloque na sua lista para assistir depois.");
        }
    }
}
