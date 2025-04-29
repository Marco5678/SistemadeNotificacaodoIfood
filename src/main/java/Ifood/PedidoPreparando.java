package Ifood;

public class PedidoPreparando implements EstadoPedido {
    @Override
    public String getDescricao() {
        return "Pedido em preparo";
    }
}


