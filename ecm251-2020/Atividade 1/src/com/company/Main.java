package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        ArrayList<Usuario> listaUsers = new ArrayList<>();
        String nome;
        String senha;
        String email;
        System.out.println("Informe o nome do usuario 1: ");
        nome = scanner.nextLine();
        System.out.println("Informe a senha do usuário 1: ");
        senha = scanner.nextLine();
        System.out.println("Informe o email do usuário 1: ");
        email = scanner.nextLine();
        Usuario user1 = new Usuario(nome, senha, email);
        listaUsers.add(user1);

        System.out.println("Informe o nome do usuário 2: ");
        nome = scanner.nextLine();
        System.out.println("Informe a senha do usuário 2: ");
        senha = scanner.nextLine();
        System.out.println("Informe o email do usuário 2: ");
        email = scanner.nextLine();
        Usuario user2 = new Usuario(nome, senha, email);
        listaUsers.add(user2);

        System.out.println("Informe o nome do usuário 3: ");
        nome = scanner.nextLine();
        System.out.println("Informe a senha do usuário 3: ");
        senha = scanner.nextLine();
        System.out.println("Informe o email do usuário 3: ");
        email = scanner.nextLine();
        Usuario user3 = new Usuario(nome, senha, email);
        listaUsers.add(user3);

        user1.AbrirConta(1000);
        user2.AbrirConta(250);
        user3.AbrirConta(3000);

        exibirInformacoes(listaUsers);

        user1.gerarRecebimento(250);
        user2.pagarUsuario(user1);
        user3.pagarUsuario(user1);
        user2.pagarUsuario(user1);
        user2.gerarRecebimento(1000);
        user3.pagarUsuario(user2);
        exibirInformacoes(listaUsers);

        scanner.close();
    }

    private static void exibirInformacoes(ArrayList<Usuario> user) {
        for (Usuario usuario : user){
            usuario.getInformacoes();
        }
    }
}
