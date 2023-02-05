package templateMethod.orcamento

import java.math.BigDecimal

class Orcamento(valor: BigDecimal, quantidadeItens: Int) {

    private var valor: BigDecimal
    private var quantidadeItens: Int

    init {
        this.valor = valor
        this.quantidadeItens = quantidadeItens
    }

    fun getValor(): BigDecimal {
        return valor
    }

    fun getQuantidadeItens(): Int {
        return quantidadeItens
    }
}