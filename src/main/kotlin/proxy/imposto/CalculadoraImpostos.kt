package proxy.imposto

import proxy.orcamento.Orcamento
import java.math.BigDecimal

class CalculadoraImpostos {

    fun calcular(orcamento: Orcamento, imposto: Imposto): BigDecimal {
        return imposto.calcular(orcamento)
    }
}