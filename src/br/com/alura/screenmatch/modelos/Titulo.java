package br.com.alura.screenmatch.modelos;
//Como o titulo se compara
public class Titulo implements Comparable<Titulo> {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int qtdAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getQtdAvaliacoes(){
        return qtdAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    //Vai imprimir no terminal quando for executado na principal.
    public void exibeFichaTecnica(){
        System.out.println("\nNome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    //Vai calcular quantas avaliações foram recebidas e somar todas.
    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        qtdAvaliacoes++;
    }

    //Retorna a média das avaliações.
    public double pegaMedia(){
        return somaDasAvaliacoes / qtdAvaliacoes;
    }

    //Esse é o comparador padrão, da classe.
    @Override
    public int compareTo(Titulo outroTitulo) {
        //Como o getNome retorna uma String, a comparação se torna mais simples,
        //pois String já tem um metodo compareTo imbutido.
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
