package observer.pedido.acao

import observer.pedido.Pedido

interface AcaoAposGerarPedido {
    fun executarAcao(pedido: Pedido)
}