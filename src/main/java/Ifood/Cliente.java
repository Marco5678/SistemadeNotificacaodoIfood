package Ifood;

import java.util.Observable;
import java.util.Observer;

public class Cliente implements Observer {

    private final String nome;
    private final Notificacao notificacao;
    private String ultimaMensagemRecebida;

    public Cliente(String nome, Notificacao notificacao) {
        this.nome = nome;
        this.notificacao = notificacao;
    }

    public String getUltimaMensagemRecebida() {
        return ultimaMensagemRecebida;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof String mensagem) {
            this.ultimaMensagemRecebida = notificacao.notificar(nome + ": " + mensagem);
        }
    }
}

