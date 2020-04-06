package com.company;

public class Conta {
    private static int totalContas = 0;
    private int idConta;
    private double saldo;
    private String QRCode = "";

    public Conta(double saldo) {
        totalContas += 1;
        this.idConta = totalContas;
        this.saldo = saldo;
    }

    public int getIdConta() {

        return idConta;

    }

    public double getSaldo() {

        return saldo;

    }

    public String getQRCode() {

        return QRCode;

    }

    public String getInformacoes() {
        String saida = String.format("Conta: {idConta: %s,saldo: %s}", this.idConta, this.saldo);
        return saida;
    }

    public void gerarQRCode(String nome, double valor) {

        this.QRCode = Transacao.getQRCode(this.idConta, nome, valor);

    }

    public static void recebimento(Conta conta, double valor){

        conta.saldo += valor;

    }
    public static void pagamento(Conta conta, double valor){

        conta.saldo -= valor;

    }
}
