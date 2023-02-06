package command.desconto

import command.orcamento.Orcamento
import java.math.BigDecimal

class CalculadoraDeDescontos {

    fun calcular(orcamento: Orcamento): BigDecimal {
        return DescontoParaOrcamentoComMaisDeCincoItens(
            DescontoParaOrcamentoComValorMaiorQueQuinhentos()
        ).calcular(orcamento)
    }
}