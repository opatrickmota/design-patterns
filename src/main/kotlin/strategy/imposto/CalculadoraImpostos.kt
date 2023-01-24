package strategy.imposto

import strategy.orcamento.Orcamento
import strategy.orcamento.TipoImposto
import java.math.BigDecimal

class CalculadoraImpostos {

    fun calcular(orcamento: Orcamento, tipoImposto: TipoImposto): BigDecimal {
        return when (tipoImposto) {
            TipoImposto.ICMS -> {
                orcamento.getValor().multiply(BigDecimal("0.1"))
            }
            TipoImposto.ISS -> {
                orcamento.getValor().multiply(BigDecimal("0.06"))
            }
        }
    }
}