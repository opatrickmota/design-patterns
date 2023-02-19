package adapter.orcamento.situacao

import adapter.orcamento.Orcamento
import java.math.BigDecimal

class Aprovado : SituacaoOrcamento() {

    override fun calcularValorDoDescontoExtra(orcamento: Orcamento): BigDecimal {
        return orcamento.getValor().multiply(BigDecimal("0.02"))
    }

    override fun finalizar(orcamento: Orcamento) {
        orcamento.setSituacao(Finalizado())
    }
}