package composite.pedido.acao

import composite.pedido.Pedido

class SalvarPedidoNoBancoDeDados : AcaoAposGerarPedido {

    override fun executarAcao(pedido: Pedido) {
        println("Salvando pedido no banco de dados!")
    }
}