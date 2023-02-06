package observer.pedido

import observer.orcamento.Orcamento
import observer.pedido.acao.EnviarEmailPedido
import observer.pedido.acao.SalvarPedidoNoBancoDeDados
import java.time.LocalDateTime

class GeraPedidoHandler {

    fun executar(dados: GeraPedido) {
        val orcamento = Orcamento(dados.orcamento, dados.quantidadeItems)

        val pedido = Pedido(dados.cliente, LocalDateTime.now(), orcamento)

        val email = EnviarEmailPedido()
        val salvar = SalvarPedidoNoBancoDeDados()
        email.executar(pedido)
        salvar.executar(pedido)
    }
}