import command.orcamento.Orcamento
import command.pedido.Pedido
import java.math.BigDecimal
import java.time.LocalDateTime

fun main(args: Array<String>) {
    val orcamento = Orcamento(BigDecimal("600"), 4)
    val cliente = "Maria Helena"
    val data = LocalDateTime.now()

    val pedido = Pedido(cliente, data, orcamento)

    println("-------- COMMAND --------")
    println("Salvar pedido no banco de dados")
    println("Enviar e-mail com dados do pedido")
    println("-----------------------")
}