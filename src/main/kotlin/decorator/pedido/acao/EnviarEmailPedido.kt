package decorator.pedido.acao

import decorator.pedido.Pedido

class EnviarEmailPedido : AcaoAposGerarPedido {

    override fun executarAcao(pedido: Pedido) {
        println("Enviando e-mail com dados do usuário!")
    }
}