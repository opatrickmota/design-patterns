package decorator.desconto

import decorator.orcamento.Orcamento
import java.math.BigDecimal

abstract class Desconto(proximo: Desconto?) {
    private var proximo: Desconto?
    init {
        this.proximo = proximo
    }

    fun calcular(orcamento: Orcamento): BigDecimal {
        if (deveAplicar(orcamento)) {
            return efetuarCalculo(orcamento)
        }
        return proximo?.calcular(orcamento) ?: BigDecimal.ZERO
    }

    protected abstract fun efetuarCalculo(orcamento: Orcamento): BigDecimal
    protected abstract fun deveAplicar(orcamento: Orcamento): Boolean
}