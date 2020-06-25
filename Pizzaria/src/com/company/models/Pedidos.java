package com.company.models;

/**importar os dois enums nessa classe*/

import com.company.Enum.Estado;
import com.company.Enum.Pagamento;

/**
 * @author Lucas Primati Menezes, 16.00683-6
 * classe para fazer os pedidos, tendo que ser informado a descriçao, valor, forma de pagamento e estado atual da entrega
 */
public class Pedidos {
    private String ID;
    private String descricao;
    private Double valor;
    private Pagamento pagamento;
    private Estado estado;

    /**
     * @param id ID sendo gerado diferentemente para identificar cada pedido
     * @param descricao sabor da pizza e complementos
     * @param valor preço da pizza
     * @param pagamento forma de pagamento
     * @param estado estado da entrega, se esta sendo preparado, ou a caminho, etc
     */
    private Pedidos(String id, String descricao, Double valor, Pagamento pagamento, Estado estado){
        ID = id;
        this.descricao = descricao;
        this.valor = valor;
        this.pagamento = pagamento;
        this.estado = estado;
    }

    //retorna o id do pedido feito

    public String getID() {
        return ID;
    }

    // altera o estado atual do pedido

    public void setEstado(Estado estado){
        this.estado =estado;
    }

    // retorna uma String na tela do pedido

    /**
     * @return retorna a frase informando todos os campos preenchidos anteriormente
     */
    @Override
    public String toString() {
        return "Pedido com o ID: " + ID + ", descriçao: " + descricao + ", estado atual do pedido: " + estado + ", forma que deseja pagar: " + pagamento + "e o valor do pedido: " + valor;
    }
}
