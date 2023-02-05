package templateMethod.imposto

import templateMethod.orcamento.Orcamento
import java.math.BigDecimal

interface Imposto {
    fun calcular(orcamento: Orcamento): BigDecimal
}