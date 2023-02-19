package decorator.imposto

import decorator.orcamento.Orcamento
import java.math.BigDecimal

abstract class Imposto(private val outroImposto: Imposto?) {

    protected abstract fun realizarCalculo(orcamento: Orcamento): BigDecimal

    fun calcular(orcamento: Orcamento): BigDecimal {
        val valorImposto = realizarCalculo(orcamento)
        var valorDoOutroImposto = BigDecimal.ZERO
        if (outroImposto != null) {
            valorDoOutroImposto = outroImposto.realizarCalculo(orcamento)
        }
        return valorImposto.add(valorDoOutroImposto)
    }
}