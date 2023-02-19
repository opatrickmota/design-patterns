package decorator.imposto

import decorator.orcamento.Orcamento
import java.math.BigDecimal

class ISS(outroImposto: Imposto? = null): Imposto(outroImposto) {
    override fun realizarCalculo(orcamento: Orcamento): BigDecimal {
        return orcamento.getValor().multiply(BigDecimal("0.06"))
    }
}