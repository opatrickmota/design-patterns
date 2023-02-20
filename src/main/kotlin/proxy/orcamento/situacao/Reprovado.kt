package proxy.orcamento.situacao

import proxy.orcamento.Orcamento

class Reprovado : SituacaoOrcamento() {

    override fun finalizar(orcamento: Orcamento) {
        orcamento.setSituacao(Finalizado())
    }
}