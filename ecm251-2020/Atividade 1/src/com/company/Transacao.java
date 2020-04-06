//Lucas Primati Menezes 16.00683-6
package com.company;

import java.util.Random;


public class Transacao {
    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static String getQRCode(int idConta, String nome, double valor ) {
        String qrCode = String.format("%s;%s;%s;%s", idConta,nome,valor,getRandomNumberInRange(1000, 9999));
        return qrCode;
    }

    public static boolean pagamentos(Usuario pagador, Usuario recebedor, double valor ){
        if (pagador.getConta().getSaldo() >= valor){
            Conta.pagamento(pagador.getConta(), valor);
            Conta.recebimento(recebedor.getConta(),valor);
            return true;
        }
        return false;
    }
    }
