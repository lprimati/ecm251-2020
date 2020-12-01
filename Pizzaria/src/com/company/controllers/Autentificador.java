package com.company.controllers;

import java.util.Scanner;

import  com.company.models.Usuario;
import com.company.Interface.Validar;

/**
 * @author Lucas Primati Menezes, 16.00683-6
 * classe de autentificaçao do login do usuario para poder fazer os pedidos ou muda-los
 */
public class Autentificador implements Validar {
    final static Scanner scanner = new Scanner(System.in);

    public boolean confirmarUsuario(Usuario usuario){

        System.out.println("Validando o Usuario... ");
        System.out.println("Digite sua senha: ");
        String senha = scanner.next();
        boolean valido = this.validarSenha(usuario, senha);
        return valido;
    }

    /**
     * @param usuario parametro usuario deve ser verificado para o login
     * @param senha parametro senha precisa ser verificado para o login
     * @return retornar se o login foi possivel
     */
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
