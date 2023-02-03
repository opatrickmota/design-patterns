package chainOfResponsibility.desconto

import chainOfResponsibility.orcamento.Orcamento
import java.math.BigDecimal

class DescontoParaOrcamentoComValorMaiorQueQuinhentos(proximo: Desconto? = null) : Desconto(proximo = proximo) {

    override fun calcular(orcamento: Orcamento): BigDecimal {
        if (orcamento.getValor().compareTo(BigDecimal("500")) > 0) {
            return orcamento.getValor().multiply(BigDecimal("0.05"))
        }
        return proximo?.calcular(orcamento) ?: BigDecimal.ZERO
    }
}