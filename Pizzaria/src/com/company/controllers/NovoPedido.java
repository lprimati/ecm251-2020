package com.company.controllers;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import com.company.Enum.*;
import com.company.models.*;

public class NovoPedido {
    private ArrayList<Pedidos> listaPedidos = new ArrayList<Pedidos>();
    private Autentificador autentificador = new Autentificador();
    private Usuario usuario;
    final static Scanner scanner = new Scanner(System.in);
    public NovoPedido(Usuario usuario){
        this.usuario = usuario;
    }

    public void pedidoNovo(){
        if (autentificador.confirmarUsuario(this.usuario)){
            System.out.println("Novo pedido: ");
            System.out.println("Descriçao do pedido: ");
            String descricao = scanner.nextLine();
            System.out.println("Valor: ");
            Double preco = Double.parseDouble(scanner.nextLine());
            Pagamento formaPagamento;
            while (true){
                try{
                   formaPagamento = this.selecionarPagamento();
                   break;
                }catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Digite novamente forma de pagamento!");
                }
            }

            Pedidos pedidos = new Pedidos(this.geradorID(), descricao, preco, formaPagamento, Estado.REALIZADO);

            listaPedidos.add(pedidos);
            System.out.println("Pedido realizado com sucesso!");
        }
    }

    public void vericarPedidos(){
        System.out.println("Lista de pedidos");
        for (Pedidos pedidos : listaPedidos){
            System.out.println(pedidos);
        }
    }

    public void alterarPedido(){
        if (autentificador.confirmarUsuario(this.usuario)){
            this.vericarPedidos();
            while (true){
                try{
                    System.out.println("Digite o ID do pedido: ");
                    String Id = scanner.nextLine();

                    Pedidos selecionarPedido = this.getPedidoPorID(Id);

                    System.out.println("Alterar o Estado do pedido");
                    selecionarPedido.setEstado(selecionarEstado);

                    System.out.println("Pedido alterado com sucesso!");
                    System.out.println(selecionarPedido);
                    break;
                }catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Digitar o Estado novamente!");
                    break;
                }
            }
        }
    }

    private Pagamento selecionarPagamento() throws ArrayIndexOutOfBoundsException{
        System.out.println("Formas de Pagamento: ");
        for (int i = 1; i <= Pagamento.values().length; i++){
            System.out.format("%d - %s\n", i, Pagamento.values()[i-1]);

        }
        int formaPagamento =Integer.parseInt(scanner.nextLine());
        return Pagamento.values()[formaPagamento-1];
    }

    private Estado selecionarEstado() throws Exception, ArrayIndexOutOfBoundsException{
        System.out.println("Estados do Pedidos: ");
        for (int i = 1; i <= Estado.values().length; i++){
            System.out.format("%d - %s\n", i, Estado.values()[i-1]);

        }
        System.out.println("0 - Sair.");
        int estado = Integer.parseInt(scanner.nextLine());
        if (estado == 0){
            throw new Exception("Estado não alterado!");

        }
        return Estado.values()[estado-1];
    }

    private Pedidos getPedidoPorID(String Id) throws
}
