package Ifood;

import java.util.Observable;

public class SistemaNotificacao extends Observable {

    private static SistemaNotificacao instance = new SistemaNotificacao();

    private SistemaNotificacao() {}

    public static SistemaNotificacao getInstance() {
        return instance;
    }

    public void notificarCliente(Cliente cliente, String mensagem) {
        addObserver(cliente);
        setChanged();
        notifyObservers(mensagem);
        deleteObserver(cliente);
    }
}


