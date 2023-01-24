package strategy.orcamento

import java.math.BigDecimal

class Orcamento(valor: BigDecimal) {

    private var valor: BigDecimal

    init {
        this.valor = valor
    }

    fun getValor(): BigDecimal {
        return valor
    }
}