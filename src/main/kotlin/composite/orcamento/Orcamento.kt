package composite.orcamento

import composite.orcamento.situacao.EmAnalise
import composite.orcamento.situacao.Finalizado
import composite.orcamento.situacao.SituacaoOrcamento
import java.math.BigDecimal

class Orcamento() {

    private var valor: BigDecimal
    private var situacao: SituacaoOrcamento
    private var items: ArrayList<ItemOrcamento>

    init {
        this.valor = BigDecimal.ZERO
        this.items = arrayListOf()
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
        return items.size
    }

    fun isFinalizado(): Boolean {
        return situacao is Finalizado
    }

    fun adicionarItem(item: ItemOrcamento) {
        this.valor = valor.add(item.valor)
        this.items.add(item)
    }
}