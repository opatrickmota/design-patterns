package proxy.pedido

import proxy.orcamento.Orcamento
import proxy.pedido.acao.AcaoAposGerarPedido
import java.time.LocalDateTime

class GeraPedidoHandler(acoes: List<AcaoAposGerarPedido>) {

    private val acoes: List<AcaoAposGerarPedido>

    init {
        this.acoes = acoes
    }

    fun executar(dados: GeraPedido) {
        val orcamento = Orcamento()

        val pedido = Pedido(dados.cliente, LocalDateTime.now(), orcamento)

        acoes.forEach { acao ->
            acao.executarAcao(pedido)
        }
    }
}