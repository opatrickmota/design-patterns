package adapter.desconto

import adapter.orcamento.Orcamento
import java.math.BigDecimal

class DescontoParaOrcamentoComMaisDeCincoItens(proximo: Desconto? = null) : Desconto(proximo = proximo) {

    override fun efetuarCalculo(orcamento: Orcamento): BigDecimal {
        return orcamento.getValor().multiply(BigDecimal("0.1"))
    }

    override fun deveAplicar(orcamento: Orcamento): Boolean {
        return orcamento.getQuantidadeItens() > 5
    }
}