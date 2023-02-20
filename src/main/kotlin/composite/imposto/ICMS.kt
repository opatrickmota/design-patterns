package composite.imposto

import composite.orcamento.Orcamento
import java.math.BigDecimal

class ICMS(outroImposto: Imposto? = null): Imposto(outroImposto) {
    override fun realizarCalculo(orcamento: Orcamento): BigDecimal {
        return orcamento.getValor().multiply(BigDecimal("0.1"))
    }
}