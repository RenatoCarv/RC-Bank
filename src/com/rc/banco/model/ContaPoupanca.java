package com.rc.banco.model;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(double agencia, double numero, Cliente titular){
        super(agencia, numero, titular);
    }

    @Override
    public void gerarExtrato() {
        System.out.println("Gerando extrato para conta poupança!");
    }
}
