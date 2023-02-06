package observer.orcamento.situacao

import observer.orcamento.Orcamento

class Reprovado : SituacaoOrcamento() {

    override fun finalizar(orcamento: Orcamento) {
        orcamento.setSituacao(Finalizado())
    }
}