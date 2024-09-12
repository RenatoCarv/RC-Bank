package com.rc.banco.model;

public class ContaCorrente extends Conta {

    public ContaCorrente(double agencia, double numero, Cliente titular){
        super(agencia, numero, titular);
    }

    @Override
    public void sacar(double valor) {
        double novoValor = valor + 2;
        super.sacar(novoValor);
    }

    @Override
    public void gerarExtrato() {
        System.out.println("Gerando extrato para conta corrente!");
    }
}
