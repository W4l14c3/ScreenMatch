package br.com.alura.exercicio.ex02;

public class ProdutoPerecivel extends Produto{
    private String dataVal;

    public ProdutoPerecivel(String nome, double preco, String dataVal) {
        super(nome, preco);
        this.dataVal = dataVal;
    }

    public String getDataVal() {
        return dataVal;
    }


    @Override
    public String toString() {
        return "\nProduto: "+getNome()+
                "\nPreço unidade: R$"+getPreco()+
                "\nQuantidade: "+getQtdProd()+
                "\nData de validade: "+getDataVal();
    }
}
