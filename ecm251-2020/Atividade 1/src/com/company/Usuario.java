package com.company;

public class Usuario {
    private String nome;
    private String senha;
    private String email;
    private Conta conta;

    public Usuario(String nome, String senha, String email) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }

    public String getNome() {

        return nome;

    }

    public String getSenha() {

        return senha;

    }

    public String getEmail() {

        return email;

    }

    public Conta getConta() {

        return conta;

    }

    public void AbrirConta(double saldo){
        if (this.conta == null)
            this.conta = new Conta(saldo);
        else {
            System.out.println("Conta ja Aberta.");
        }
    }

    public void getInformacoes() {
        System.out.format("Nome Usuário: %s - Saldo: %.2f \n",this.nome,this.conta.getSaldo());
    }

    public void gerarRecebimento(double valor){
        this.conta.gerarQRCode(nome, valor);
        System.out.format("Codigo Gerado no valor de %.2f\n",valor);
    }
    public void pagarUsuario(Usuario user) {
        if (user.conta.getQRCode() != ""){
            String[] dados = user.conta.getQRCode().split(";");
            boolean result = Transacao.pagamentos(this, user, Double.parseDouble(dados[2]));
            if (result)
                System.out.println("Pagamento Efetuado");
            else
                System.out.println("Erro no pagamento");
        } else {
            System.out.println("Usuario sem operação de recebimento.");
        }

    }
}
