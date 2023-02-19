package adapter.pedido

import adapter.orcamento.Orcamento
import adapter.pedido.acao.AcaoAposGerarPedido
import java.time.LocalDateTime

class GeraPedidoHandler(acoes: List<AcaoAposGerarPedido>) {

    private val acoes: List<AcaoAposGerarPedido>

    init {
        this.acoes = acoes
    }

    fun executar(dados: GeraPedido) {
        val orcamento = Orcamento(dados.orcamento, dados.quantidadeItems)

        val pedido = Pedido(dados.cliente, LocalDateTime.now(), orcamento)

        acoes.forEach { acao ->
            acao.executarAcao(pedido)
        }
    }
}