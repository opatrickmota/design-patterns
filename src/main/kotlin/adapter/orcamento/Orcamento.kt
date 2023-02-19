package adapter.orcamento

import adapter.orcamento.situacao.EmAnalise
import adapter.orcamento.situacao.Finalizado
import adapter.orcamento.situacao.SituacaoOrcamento
import java.math.BigDecimal

class Orcamento(valor: BigDecimal, quantidadeItens: Int) {

    private var valor: BigDecimal
    private var quantidadeItens: Int
    private var situacao: SituacaoOrcamento

    init {
        this.valor = valor
        this.quantidadeItens = quantidadeItens
        this.situacao = EmAnalise()
    }

    fun aplicarDescontoExtra() {
        val valorDoDescontoExtra = this.situacao.calcularValorDoDescontoExtra(this)
        this.valor = this.valor.subtract(valorDoDescontoExtra)
    }

    fun aprovar() {
        this.situacao.aprovar(this)
    }

    fun reprovar() {
        this.situacao.reprovar(this)
    }

    fun finalizar() {
        this.situacao.finalizar(this)
    }

    fun setSituacao(situacaoOrcamento: SituacaoOrcamento) {
        this.situacao = situacaoOrcamento
    }

    fun getValor(): BigDecimal {
        return valor
    }

    fun getQuantidadeItens(): Int {
        return quantidadeItens
    }

    fun isFinalizado(): Boolean {
        return situacao is Finalizado
    }
}