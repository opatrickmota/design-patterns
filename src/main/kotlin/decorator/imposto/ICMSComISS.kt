package decorator.imposto

import decorator.orcamento.Orcamento
import java.math.BigDecimal

class ICMSComISS: Imposto {
    override fun calcular(orcamento: Orcamento): BigDecimal {
        /* Combina impostos. Essa solucao de combinar pode fazer com que se tenha varias classes
        caso suja novas combinacoes. */
        val icms = ICMS().calcular(orcamento)
        val iss = ISS().calcular(orcamento)
        return icms.add(iss)
    }
}