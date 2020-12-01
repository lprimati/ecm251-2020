package com.company.models;

/**
 * @author Lucas Primati Menezes, 16.00683-6
 * usuario que esta fazendo os pedidos, responsavel.
 */
public class Usuario {
    private String nome;
    private String senha;
    private String email;

    public Usuario(String nome, String email, String senha){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
    // retorna String da senha
    public String getSenha(){
        return senha;
    }

    @Override
    public String toString() {
        return "Usuario 1 (" + "email: " + email + "- nome: " + nome + "- senha: " + senha + ")";
    }
}