package composite.orcamento

import java.math.BigDecimal

class ItemOrcamento(valor: BigDecimal): Orcavel {

    private var valor: BigDecimal

    init {
        this.valor = valor
    }

    override fun getValor(): BigDecimal {
        return valor
    }
}