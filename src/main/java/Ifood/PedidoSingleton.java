package Ifood;

public class PedidoSingleton {
    private static Pedido instancia;

    private PedidoSingleton() {}

    public static Pedido getInstancia() {
        if (instancia == null) {
            instancia = new Pedido();
        }
        return instancia;
    }
}