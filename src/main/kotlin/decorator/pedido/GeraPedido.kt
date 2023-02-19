package decorator.pedido

import java.math.BigDecimal

class GeraPedido(cliente: String, orcamento: BigDecimal, quantidadeItems: Int) {

    var cliente: String
        private set
    var orcamento: BigDecimal
        private set
    var quantidadeItems: Int
        private set

    init {
        this.cliente = cliente
        this.orcamento = orcamento
        this.quantidadeItems = quantidadeItems
    }

}