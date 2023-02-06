package observer.imposto

import observer.orcamento.Orcamento
import java.math.BigDecimal

class CalculadoraImpostos {

    fun calcular(orcamento: Orcamento, imposto: Imposto): BigDecimal {
        return imposto.calcular(orcamento)
    }
}