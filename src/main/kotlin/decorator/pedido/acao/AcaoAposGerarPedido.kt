package decorator.pedido.acao

import decorator.pedido.Pedido

interface AcaoAposGerarPedido {
    fun executarAcao(pedido: Pedido)
}