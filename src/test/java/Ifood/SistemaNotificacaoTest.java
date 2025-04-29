package Ifood;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SistemaNotificacaoTest {

    @Test
    void deveNotificarClientePorSms() {
        Cliente cliente = new Cliente("João", NotificacaoFactory.criarNotificacao("SMS"));
        Pedido pedido = new Pedido(cliente);
        assertEquals("SMS: João: Pedido recebido", cliente.getUltimaMensagemRecebida());
    }

    @Test
    void deveNotificarClientePorEmail() {
        Cliente cliente = new Cliente("Maria", NotificacaoFactory.criarNotificacao("EMAIL"));
        Pedido pedido = new Pedido(cliente);
        pedido.mudarEstado(new PedidoPreparando());
        assertEquals("EMAIL: Maria: Pedido em preparo", cliente.getUltimaMensagemRecebida());
    }

    @Test
    void deveNotificarClientePorApp() {
        Cliente cliente = new Cliente("Carlos", NotificacaoFactory.criarNotificacao("APP"));
        Pedido pedido = new Pedido(cliente);
        pedido.mudarEstado(new PedidoEnviado());
        assertEquals("APP: Carlos: Pedido enviado", cliente.getUltimaMensagemRecebida());
    }

    @Test
    void deveLancarErroParaTipoNotificacaoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            NotificacaoFactory.criarNotificacao("CARTA");
        });
    }

    @Test
    void deveAtualizarEstadoPedidoCorretamente() {
        Cliente cliente = new Cliente("Ana", NotificacaoFactory.criarNotificacao("SMS"));
        Pedido pedido = new Pedido(cliente);
        pedido.mudarEstado(new PedidoPreparando());
        assertEquals("Pedido em preparo", pedido.getEstadoDescricao());
        pedido.mudarEstado(new PedidoEnviado());
        assertEquals("Pedido enviado", pedido.getEstadoDescricao());
        pedido.mudarEstado(new PedidoEntregue());
        assertEquals("Pedido entregue", pedido.getEstadoDescricao());
    }
}

