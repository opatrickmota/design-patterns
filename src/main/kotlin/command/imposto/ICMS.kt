package command.imposto

import command.orcamento.Orcamento
import java.math.BigDecimal

class ICMS: Imposto {
    override fun calcular(orcamento: Orcamento): BigDecimal {
        return orcamento.getValor().multiply(BigDecimal("0.1"))
    }
}