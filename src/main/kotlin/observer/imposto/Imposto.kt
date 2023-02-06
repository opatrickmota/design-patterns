package observer.imposto

import observer.orcamento.Orcamento
import java.math.BigDecimal

interface Imposto {
    fun calcular(orcamento: Orcamento): BigDecimal
}