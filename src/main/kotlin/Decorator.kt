import decorator.orcamento.Orcamento
import decorator.imposto.ICMS
import decorator.imposto.ISS
import decorator.imposto.CalculadoraImpostos
import java.math.BigDecimal

fun main(args: Array<String>) {
    val orcamento = Orcamento(BigDecimal("100"), 1)
    val calculadora = CalculadoraImpostos()

    println("Combinacao de imposto: " +  calculadora.calcular(orcamento, ISS(ICMS())))
}