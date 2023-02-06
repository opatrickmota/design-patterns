package observer.pedido.acao

import observer.pedido.Pedido

class EnviarEmailPedido : AcaoAposGerarPedido {

    override fun executarAcao(pedido: Pedido) {
        println("Enviando e-mail com dados do usuário!")
    }
}