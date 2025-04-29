package Ifood;

public class SmsNotificacao implements Notificacao {
    @Override
    public String notificar(String mensagem) {
        return "SMS: " + mensagem;
    }
}

