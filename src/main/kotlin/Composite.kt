import composite.orcamento.ItemOrcamento
import composite.orcamento.Orcamento
import java.math.BigDecimal

fun main(args: Array<String>) {
    val antigo = Orcamento()
    antigo.adicionarItem(ItemOrcamento(BigDecimal("200")))
    antigo.reprovar()

    val novo = Orcamento()
    novo.adicionarItem(ItemOrcamento(BigDecimal("500")))
    novo.adicionarItem(antigo)

    println("Valor do novo orcamento junto com o antigo: " + novo.getValor())

}