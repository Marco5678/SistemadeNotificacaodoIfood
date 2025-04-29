package Ifood;

public class NotificacaoFactory {

    public static Notificacao criarNotificacao(String tipo) {
        if (tipo == null) {
            throw new IllegalArgumentException("Tipo de notificação não pode ser nulo");
        }

        switch (tipo.toUpperCase()) {
            case "SMS":
                return new SmsNotificacao();
            case "EMAIL":
                return new EmailNotificacao();
            case "APP":
                return new AppNotificacao();
            default:
                throw new IllegalArgumentException("Tipo de notificação inválido: " + tipo);
        }
    }
}


