package com.rc.banco.model;

import com.rc.banco.exception.SaldoInsuficienteException;

public abstract class Conta {
    private double agencia;
    private double numero;
    private Cliente titular;
    private double saldo;
    private static int total;

    public Conta(double agencia, double numero, Cliente titular){
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;

        Conta.total++;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException(STR."Saldo insuficiente, saldo atual: \{getSaldo()}");
        }
        this.saldo -= valor;
    }

    public void transferir(double valor, Conta destino){
        this.sacar(valor);
        destino.depositar(valor);
    }

    public abstract void gerarExtrato();

    public double getAgencia() {
        return agencia;
    }

    public void setAgencia(double agencia) {
        this.agencia = agencia;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Conta.total = total;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", titular=" + titular +
                ", saldo=" + saldo +
                '}';
    }
}
