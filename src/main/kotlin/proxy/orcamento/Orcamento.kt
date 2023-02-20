package proxy.orcamento

import proxy.orcamento.situacao.EmAnalise
import proxy.orcamento.situacao.Finalizado
import proxy.orcamento.situacao.SituacaoOrcamento
import java.math.BigDecimal

class Orcamento(): Orcavel {

    private var valor: BigDecimal
    private var situacao: SituacaoOrcamento
    private var items: ArrayList<Orcavel>

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

    override fun getValor(): BigDecimal {
        Thread.sleep(5000)
        return valor
    }

    fun getQuantidadeItens(): Int {
        return items.size
    }

    fun isFinalizado(): Boolean {
        return situacao is Finalizado
    }

    fun adicionarItem(item: Orcavel) {
        this.valor = valor.add(item.getValor())
        this.items.add(item)
    }
}