package adapter.imposto

import adapter.orcamento.Orcamento
import java.math.BigDecimal

interface Imposto {
    fun calcular(orcamento: Orcamento): BigDecimal
}