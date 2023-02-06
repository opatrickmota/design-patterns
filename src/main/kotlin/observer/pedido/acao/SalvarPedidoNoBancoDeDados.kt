package observer.pedido.acao

import observer.pedido.Pedido

class SalvarPedidoNoBancoDeDados {

    fun executar(pedido: Pedido) {
        println("Salvando pedido no banco de dados!")
    }
}