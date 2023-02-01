package chainOfResponsibility.desconto

import chainOfResponsibility.orcamento.Orcamento
import java.math.BigDecimal

class CalculadoraDeDescontos {

    fun calcular(orcamento: Orcamento): BigDecimal {
        if (orcamento.getQuantidadeItens() > 5) {
            return orcamento.getValor().multiply(BigDecimal("0.1"))
        }
        if (orcamento.getValor().compareTo(BigDecimal("500")) > 0) {
            return orcamento.getValor().multiply(BigDecimal("0.1"))
        }
        return BigDecimal.ZERO
    }
}