package composite.pedido.acao

import composite.pedido.Pedido

interface AcaoAposGerarPedido {
    fun executarAcao(pedido: Pedido)
}