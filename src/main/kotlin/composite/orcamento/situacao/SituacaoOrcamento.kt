package composite.orcamento.situacao

import composite.orcamento.Orcamento
import java.math.BigDecimal

abstract class SituacaoOrcamento {

    open fun calcularValorDoDescontoExtra(orcamento: Orcamento): BigDecimal {
        return BigDecimal.ZERO
    }

    open fun aprovar(orcamento: Orcamento) {
        throw Throwable("Orcamento não pode ser aprovado")
    }

    open fun reprovar(orcamento: Orcamento) {
        throw Throwable("Orcamento não pode ser reprovado")
    }

    open fun finalizar(orcamento: Orcamento) {
        throw Throwable("Orcamento não pode ser finalizado")
    }

}