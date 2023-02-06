package command.pedido

import command.orcamento.Orcamento
import java.time.LocalDateTime

class GeraPedidoHandler {

    fun executa(dados: GeraPedido) {
        val orcamento = Orcamento(dados.orcamento, dados.quantidadeItems)

        val pedido = Pedido(dados.cliente, LocalDateTime.now(), orcamento)

        println("-------- COMMAND --------")
        /* E aqui usaria a injeção de dependência para salvar e enviar e-mail */
        println("Salvar pedido no banco de dados")
        println("Enviar e-mail com dados do pedido")
        println("-----------------------")
    }
}