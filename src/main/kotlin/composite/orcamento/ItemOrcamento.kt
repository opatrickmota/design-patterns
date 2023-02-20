package composite.orcamento

import java.math.BigDecimal

class ItemOrcamento(valor: BigDecimal) {

    var valor: BigDecimal
        private set

    init {
        this.valor = valor
    }

}