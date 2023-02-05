package state.orcamento

import java.math.BigDecimal

class Orcamento(valor: BigDecimal, quantidadeItens: Int) {

    private var valor: BigDecimal
    private var quantidadeItens: Int
    private var situacao: String

    init {
        this.valor = valor
        this.quantidadeItens = quantidadeItens
        this.situacao = "EM ANALISE"
    }

    fun aplicarDescontoExtra() {
        var valorDoDescontoExtra = BigDecimal.ZERO

        /* UMA CADEIA DE IF PARA CADA SITUAÇÃO, MESMO SE FOSSE ENUM */

        if (situacao.equals("EM ANALISE")){
            valorDoDescontoExtra = BigDecimal("0.05")
        } else if (situacao.equals("APROVADO")) {
            valorDoDescontoExtra = BigDecimal("0.02")
        }

        this.valor = this.valor.subtract(valorDoDescontoExtra)
    }

    fun aprovar() {
        this.situacao = "APROVADO"
    }

    fun getValor(): BigDecimal {
        return valor
    }

    fun getQuantidadeItens(): Int {
        return quantidadeItens
    }
}