package br.com.alura.exercicio.ex03.contabancaria;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ContaBancaria conta01 = new ContaBancaria(0, 0);
        ContaBancaria conta02 = new ContaBancaria(5231, 43.500);
        ContaBancaria conta03 = new ContaBancaria(3213, 12.902);
        ContaBancaria conta04 = new ContaBancaria(6543, 5.000);

        ArrayList<ContaBancaria> listaContas = new ArrayList<>();
        listaContas.add(conta02);
        listaContas.add(conta03);
        listaContas.add(conta04);

        ContaBancaria contaMaior = conta01;
        for (ContaBancaria conta : listaContas){
            if(contaMaior.getSaldo() < conta.getSaldo()){
                contaMaior = conta;
            }
        }

        System.out.println("A conta com maior saldo - Número: " + contaMaior.getNumeroDaConta() +
                "\n O saldo da conta é: R$ " + contaMaior.getSaldo());

    }
}
