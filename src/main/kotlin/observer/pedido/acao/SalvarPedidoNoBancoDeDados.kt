package observer.pedido.acao

import observer.pedido.Pedido

class SalvarPedidoNoBancoDeDados : AcaoAposGerarPedido {

    override fun executarAcao(pedido: Pedido) {
        println("Salvando pedido no banco de dados!")
    }
}