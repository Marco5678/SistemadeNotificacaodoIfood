package Ifood;

public class Pedido {

    private EstadoPedido estado;
    private final Cliente cliente;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.estado = new PedidoRecebido();
        SistemaNotificacao.getInstance().notificarCliente(cliente, estado.getDescricao());
    }

    public void mudarEstado(EstadoPedido novoEstado) {
        this.estado = novoEstado;
        SistemaNotificacao.getInstance().notificarCliente(cliente, estado.getDescricao());
    }

    public String getEstadoDescricao() {
        return estado.getDescricao();
    }
}

