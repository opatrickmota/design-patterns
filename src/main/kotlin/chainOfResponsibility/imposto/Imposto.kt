package chainOfResponsibility.imposto

import chainOfResponsibility.orcamento.Orcamento
import java.math.BigDecimal

interface Imposto {
    fun calcular(orcamento: Orcamento): BigDecimal
}