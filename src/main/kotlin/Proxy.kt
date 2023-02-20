import proxy.orcamento.ItemOrcamento
import proxy.orcamento.Orcamento
import java.math.BigDecimal
import java.time.LocalDateTime

fun main(args: Array<String>) {
    val antigo = Orcamento()
    antigo.adicionarItem(ItemOrcamento(BigDecimal("200")))
    antigo.reprovar()

    val novo = Orcamento()
    novo.adicionarItem(ItemOrcamento(BigDecimal("500")))
    novo.adicionarItem(antigo)

    println("Demora de 5 segundos: " + novo.getValor() + ", carregou na hora: " + LocalDateTime.now())
    println("Demora de 5 segundos: " + novo.getValor() + ", carregou na hora: " + LocalDateTime.now())
    /* nao mudou nada nos dados, mas demora 5 segundos na segunda chamada tambem */

}