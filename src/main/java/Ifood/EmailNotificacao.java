package Ifood;

public class EmailNotificacao implements Notificacao {
    @Override
    public String notificar(String mensagem) {
        return "EMAIL: " + mensagem;
    }
}

