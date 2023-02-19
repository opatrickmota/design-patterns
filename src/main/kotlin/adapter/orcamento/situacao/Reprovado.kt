package adapter.orcamento.situacao

import adapter.orcamento.Orcamento

class Reprovado : SituacaoOrcamento() {

    override fun finalizar(orcamento: Orcamento) {
        orcamento.setSituacao(Finalizado())
    }
}