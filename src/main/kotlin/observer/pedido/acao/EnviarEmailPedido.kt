package observer.pedido.acao

import observer.pedido.Pedido

class EnviarEmailPedido {

    fun executar(pedido: Pedido) {
        println("Enviando e-mail com dados do usuário!")
    }
}