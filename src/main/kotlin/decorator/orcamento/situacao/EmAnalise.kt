package decorator.orcamento.situacao

import decorator.orcamento.Orcamento
import java.math.BigDecimal

class EmAnalise : SituacaoOrcamento() {

    override fun calcularValorDoDescontoExtra(orcamento: Orcamento): BigDecimal {
        return orcamento.getValor().multiply(BigDecimal("0.05"))
    }

    override fun aprovar(orcamento: Orcamento) {
        orcamento.setSituacao(Aprovado())
    }

    override fun reprovar(orcamento: Orcamento) {
        orcamento.setSituacao(Reprovado())
    }
}