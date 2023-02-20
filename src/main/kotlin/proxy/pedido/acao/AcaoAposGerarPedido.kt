package proxy.pedido.acao

import proxy.pedido.Pedido

interface AcaoAposGerarPedido {
    fun executarAcao(pedido: Pedido)
}