package proxy.orcamento

import java.math.BigDecimal

class OrcamentoProxy(orcamento: Orcamento): Orcavel {


    private var valor: BigDecimal? = null
    private var orcamento: Orcamento

    init {
        this.orcamento = orcamento
    }

    override fun getValor(): BigDecimal {
        if (valor == null) {
            this.valor = orcamento.getValor()
        }

        return this.valor!!
    }

}