package decorator.desconto

import decorator.orcamento.Orcamento
import java.math.BigDecimal

class CalculadoraDeDescontos {

    fun calcular(orcamento: Orcamento): BigDecimal {
        return DescontoParaOrcamentoComMaisDeCincoItens(
            DescontoParaOrcamentoComValorMaiorQueQuinhentos()
        ).calcular(orcamento)
    }
}