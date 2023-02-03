package chainOfResponsibility.desconto

import chainOfResponsibility.orcamento.Orcamento
import java.math.BigDecimal

class DescontoParaOrcamentoComMaisDeCincoItens(proximo: Desconto? = null) : Desconto(proximo = proximo) {

    override fun calcular(orcamento: Orcamento): BigDecimal {
        if (orcamento.getQuantidadeItens() > 5) {
            return orcamento.getValor().multiply(BigDecimal("0.1"))
        }
        return proximo?.calcular(orcamento) ?: BigDecimal.ZERO
    }
}