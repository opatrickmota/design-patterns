package chainOfResponsibility.imposto

import chainOfResponsibility.orcamento.Orcamento
import java.math.BigDecimal

class CalculadoraImpostos {

    fun calcular(orcamento: Orcamento, imposto: Imposto): BigDecimal {
        return imposto.calcular(orcamento)
    }
}