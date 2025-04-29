package Ifood;

public class PedidoRecebido implements EstadoPedido {
    @Override
    public String getDescricao() {
        return "Pedido recebido";
    }
}
