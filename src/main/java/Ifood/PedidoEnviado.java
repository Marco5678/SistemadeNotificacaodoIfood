package Ifood;

public class PedidoEnviado implements EstadoPedido {
    @Override
    public String getDescricao() {
        return "Pedido enviado";
    }
}

