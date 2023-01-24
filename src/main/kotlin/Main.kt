import strategy.imposto.CalculadoraImpostos
import strategy.orcamento.Orcamento
import strategy.orcamento.TipoImposto
import java.math.BigDecimal

fun main(args: Array<String>) {

    val orcamento = Orcamento(BigDecimal("100"))
    val calculadora = CalculadoraImpostos()

    println(calculadora.calcular(orcamento, TipoImposto.ISS))

}