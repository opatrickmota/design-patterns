package composite.desconto

import composite.orcamento.Orcamento
import java.math.BigDecimal

class DescontoParaOrcamentoComValorMaiorQueQuinhentos(proximo: Desconto? = null) : Desconto(proximo = proximo) {

    override fun efetuarCalculo(orcamento: Orcamento): BigDecimal {
        return orcamento.getValor().multiply(BigDecimal("0.05"))
    }

    override fun deveAplicar(orcamento: Orcamento): Boolean {
        return orcamento.getValor().compareTo(BigDecimal("500")) > 0
    }
}