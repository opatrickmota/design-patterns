import observer.pedido.GeraPedido
import observer.pedido.GeraPedidoHandler
import observer.pedido.acao.EnviarEmailPedido
import observer.pedido.acao.SalvarPedidoNoBancoDeDados
import java.math.BigDecimal

fun main(args: Array<String>) {
    println("Nome: ")
    val cliente: String = readlnOrNull().toString()
    println("Valor: ")
    val valorOrcamento = BigDecimal(readlnOrNull().toString())
    println("Quantidade: ")
    val quantidadeItems: Int = readlnOrNull()?.toInt() ?: 1

    val gerador = GeraPedido(cliente, valorOrcamento, quantidadeItems)
    val handler = GeraPedidoHandler(listOf(SalvarPedidoNoBancoDeDados(), EnviarEmailPedido()))
    handler.executar(gerador)
}