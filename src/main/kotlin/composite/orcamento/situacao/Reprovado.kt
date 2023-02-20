package composite.orcamento.situacao

import composite.orcamento.Orcamento

class Reprovado : SituacaoOrcamento() {

    override fun finalizar(orcamento: Orcamento) {
        orcamento.setSituacao(Finalizado())
    }
}