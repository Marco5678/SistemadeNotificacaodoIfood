package Ifood;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PedidoSingletonTest {

    @Test
    void testInstanciacaoSingleton() {
        Pedido pedido1 = PedidoSingleton.getInstancia();
        Pedido pedido2 = PedidoSingleton.getInstancia();
        assertSame(pedido1, pedido2);
    }
}

