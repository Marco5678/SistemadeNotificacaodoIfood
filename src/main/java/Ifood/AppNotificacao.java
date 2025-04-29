package Ifood;

public class AppNotificacao implements Notificacao {
    @Override
    public String notificar(String mensagem) {
        return "APP: " + mensagem;
    }
}


