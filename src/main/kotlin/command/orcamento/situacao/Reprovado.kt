package command.orcamento.situacao

import command.orcamento.Orcamento

class Reprovado : SituacaoOrcamento() {

    override fun finalizar(orcamento: Orcamento) {
        orcamento.setSituacao(Finalizado())
    }
}