package adapter.imposto

import adapter.orcamento.Orcamento
import java.math.BigDecimal

class ISS: Imposto {
    override fun calcular(orcamento: Orcamento): BigDecimal {
        return orcamento.getValor().multiply(BigDecimal("0.06"))
    }
}