package strategy.imposto

import strategy.orcamento.Orcamento
import java.math.BigDecimal

interface Imposto {
    fun calcular(orcamento: Orcamento): BigDecimal
}