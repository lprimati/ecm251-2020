package com.company.controllers;

import java.util.Scanner;

import  com.company.models.Usuario;
import Interface.Validar;

public class Atentificador implements Validar {
    final static Scanner scanner = new Scanner(System.in);

    public boolean confirmarUsuario(Usuario usuario){

        System.out.println("Validando o Usuario... ");
        System.out.println("Digite sua senha: ");
        String senha = scanner.next();
        boolean valido = this.validarSenha(usuario, senha);
        return valido;
    }

    @Override
    public boolean validarSenha(Usuario usuario, String senha) {
        if (usuario.getSenha().equals(senha)){
            System.out.println("Senha valida!");
            return true;
        }
        System.out.println("Senha Invalida!");
        return false;
    }
}
