package com.company;

import java.util.Scanner;

import com.company.controllers.NovoPedido;
import com.company.models.Usuario;

public class Pizzaria {
    final static Scanner scanner = new Scanner(System.in);
    public static void run(){
        int menu;
        Usuario usuario = new Usuario("Admin", "admin@maua.br", "123456");
        NovoPedido sistemaPedidos = new NovoPedido(usuario);

        do {
            System.out.println("Pizzaria o Rato que Ri!");
            System.out.println("1 - Nova Venda");
            System.out.println("2 - Verificar pedidos");
            System.out.println("3 - Alterar Pedidos");
            System.out.println("0 - Sair");
            menu = scanner.nextInt();
            switch (menu){
                case 1:
                    sistemaPedidos.pedidoNovo();
                    break;
                case 2:
                    sistemaPedidos.vericarPedidos();
                    break;
                case 3:
                    sistemaPedidos.alterarPedido();
                    break;
                default:
                    break;
            }
            System.out.println();
        }while (menu != 0);
        System.out.println("...");
    }
}
