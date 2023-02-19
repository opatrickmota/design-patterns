package adapter.pedido.acao

import adapter.pedido.Pedido

interface AcaoAposGerarPedido {
    fun executarAcao(pedido: Pedido)
}