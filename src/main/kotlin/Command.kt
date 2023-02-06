import command.pedido.GeraPedido
import command.pedido.GeraPedidoHandler
import java.math.BigDecimal

fun main(args: Array<String>) {
    println("Nome: ")
    val cliente: String = readlnOrNull().toString()
    println("Valor: ")
    val valorOrcamento = BigDecimal(readlnOrNull().toString())
    println("Quantidade: ")
    val quantidadeItems: Int = readlnOrNull()?.toInt() ?: 1

    val gerador = GeraPedido(cliente, valorOrcamento, quantidadeItems)
    val handler = GeraPedidoHandler()
    handler.executa(gerador)
}