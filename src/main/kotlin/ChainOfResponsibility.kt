import chainOfResponsibility.desconto.CalculadoraDeDescontos
import chainOfResponsibility.orcamento.Orcamento
import java.math.BigDecimal

fun main(args: Array<String>) {
    val primeiroOrcamento = Orcamento(BigDecimal("200"), 6)
    val segundoOrcamento = Orcamento(BigDecimal("1000"), 1)
    val calculadora = CalculadoraDeDescontos()

    println("-------- CHAIN OF RESPONSIBILITY --------")
    println("Desconto do primeiro orcamento foi de: " + calculadora.calcular(primeiroOrcamento))
    println("Desconto do segundo orcamento foi de: " + calculadora.calcular(segundoOrcamento))
    println("-----------------------")
}