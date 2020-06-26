package com.company.controllers;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import com.company.Enum.Estado;
import com.company.Enum.Pagamento;
import com.company.Excecoes.ErroDeID;
import com.company.models.Pedidos;
import com.company.models.Usuario;


/**
 * @author Lucas Primati Menezes, 16.00683-6
 * classe onde o pedido é feito e mudado, tambem onde o estado do pedido é alterado
 */
public class NovoPedido {
    private ArrayList<Pedidos> listaPedidos = new ArrayList<Pedidos>();
    private Autentificador autentificador = new Autentificador();
    private Usuario usuario;
    final static Scanner scanner = new Scanner(System.in);
    public NovoPedido(Usuario usuario){
        this.usuario = usuario;
    }

    /**
     * @return retorna um ID aleatorio para cada pedido, sem repetir o ID
     */
    private String geradorID(){
        Random random = new Random();
        String idGerado = "";
        for (int i = 0; i < 3; i++){
            idGerado += random.nextInt(10);
        }
        return idGerado;
    }

    /**
     * Ao escolher no menu para fazer pedido novo, é mandado para essa classe
     */
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

    /**
     * classe para mudar o pedido, para isso é preciso confirmar o usuario
     * nessa classe tambem se altera o estado do pedido, em q etapa ele está
     */
    public void alterarPedido(){
        if (autentificador.confirmarUsuario(this.usuario)){
            this.vericarPedidos();
            while (true){
                try{
                    System.out.println("Digite o ID do pedido: ");
                    String Id = scanner.nextLine();

                    Pedidos selecionarPedido = this.getPedidoPorID(Id);

                    //System.out.println("Alterar descriçao do pedido: ");
                    //String descricao = scanner.nextLine();

                    //System.out.println("Novo valor: ");
                    //Double preco = Double.parseDouble(scanner.nextLine());

                    System.out.println("Alterar o Estado do pedido");
                    selecionarPedido.setEstado(selecionarEstado());

                    System.out.println("Pedido alterado com sucesso!");
                    System.out.println(selecionarPedido);
                    break;
                }catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Digitar o Estado novamente!");
                }catch (ErroDeID e) {
                    System.out.println(e.getMessage());
                }catch (Exception e){
                    System.out.println(e.getMessage());
                    break;
                }
            }
        }
    }

    /**
     * @return retorna a forma de pagamento selecionada
     * @throws ArrayIndexOutOfBoundsException
     * escolhi em escolher por "opcoes" por ser um metodo mais dificil de errar o que se digita na interface
     */
    private Pagamento selecionarPagamento() throws ArrayIndexOutOfBoundsException{
        System.out.println("Formas de Pagamento: ");
        for (int i = 1; i <= Pagamento.values().length; i++){
            System.out.format("%d - %s\n", i, Pagamento.values()[i-1]);

        }
        int formaPagamento =Integer.parseInt(scanner.nextLine());
        return Pagamento.values()[formaPagamento-1];
    }

    public void vericarPedidos(){
        System.out.println("Lista de pedidos");
        for (Pedidos pedidos : listaPedidos){
            System.out.println(pedidos);
        }
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

    /**
     * @param Id verifica se o ID existe
     * @return retorna o pedido de acordo com o ID colocado
     * @throws ErroDeID caso o ID nao exista coloca a msg de ID nao identificado
     */
    private Pedidos getPedidoPorID(String Id) throws ErroDeID{
        for (Pedidos pedidos : listaPedidos){
            if (pedidos.getID().equals(Id)){
                return pedidos;
            }
        }
        throw new ErroDeID("ID não identificado! ");
    }
}
