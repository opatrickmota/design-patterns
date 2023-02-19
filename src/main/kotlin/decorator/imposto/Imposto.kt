package decorator.imposto

import decorator.orcamento.Orcamento
import java.math.BigDecimal

interface Imposto {
    fun calcular(orcamento: Orcamento): BigDecimal
}