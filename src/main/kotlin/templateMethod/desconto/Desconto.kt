package templateMethod.desconto

import templateMethod.orcamento.Orcamento
import java.math.BigDecimal

abstract class Desconto(proximo: Desconto?) {
    protected var proximo: Desconto?
    init {
        this.proximo = proximo
    }

    abstract fun calcular(orcamento: Orcamento): BigDecimal
}