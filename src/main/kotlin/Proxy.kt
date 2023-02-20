import proxy.orcamento.ItemOrcamento
import proxy.orcamento.Orcamento
import proxy.orcamento.OrcamentoProxy
import java.math.BigDecimal
import java.time.LocalDateTime

fun main(args: Array<String>) {
    val antigo = Orcamento()
    antigo.adicionarItem(ItemOrcamento(BigDecimal("200")))
    antigo.reprovar()

    val novo = Orcamento()
    novo.adicionarItem(ItemOrcamento(BigDecimal("500")))
    novo.adicionarItem(antigo)

    val proxy = OrcamentoProxy(novo)

    println("Chamando o mesmo recurso duas vezes, sendo necessario 5 segundos na primeira chamada.")
    println("A segunda chamada executa de forma mais rapida.")
    println()
    println("Demora de 5 segundos: " + proxy.getValor() + ", carregou na hora: " + LocalDateTime.now())
    println("Segunda chamada com proxy: " + proxy.getValor() + ", carregou na hora: " + LocalDateTime.now())

    /* Inicialização lazy tambem retorna o valor em cache a partir da segunda chamada */

}