package proxy.pedido.acao

import proxy.pedido.Pedido

class EnviarEmailPedido : AcaoAposGerarPedido {

    override fun executarAcao(pedido: Pedido) {
        println("Enviando e-mail com dados do usuário!")
    }
}