package com.company.models;

/**importar os dois enums nessa classe*/

import Enum.Estado;
import Enum.Pagamento;

public class Pedidos {
    private String ID;
    private String descricao;
    private Double valor;
    private Pagamento pagamento;
    private Estado estado;

    private Pedidos(String id, String descricao, Double valor, Pagamento pagamento, Estado estado){
        ID = id;
        this.descricao = descricao;
        this.valor = valor;
        this.pagamento = pagamento;
        this.estado = estado;
    }

    /** retorna o id do pedido feito */

    public String getID() {
        return ID;
    }

    /** altera o estado atual do pedido */

    public void setEstado(Estado estado){
        this.estado =estado;
    }

    /** retorna uma String na tela do pedido*/

    @Override
    public String toString() {
        return "Pedido com o ID: " + ID + ", descriçao: " + descricao + ", estado atual do pedido: " + estado + ", forma que deseja pagar: " + pagamento + "e o valor do pedido: " + valor;
    }
}
