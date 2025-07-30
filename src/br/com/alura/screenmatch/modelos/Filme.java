package br.com.alura.screenmatch.modelos;

public class Filme {
    public String nome;
    int anoDeLancamento;
    boolean avaliacao;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    //Vai imprimir no terminal quando for executado na principal.
    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    //Vai calcular quantas avaliações foram recebidas e somar todas.
    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
