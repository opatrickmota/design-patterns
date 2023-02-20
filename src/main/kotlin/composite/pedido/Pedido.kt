package composite.pedido

import composite.orcamento.Orcamento
import java.time.LocalDateTime

class Pedido(cliente: String, data: LocalDateTime, orcamento: Orcamento) {

    var cliente: String
        private set
    var data: LocalDateTime
        private set
    var orcamento: Orcamento
        private set

    init {
        this.cliente = cliente
        this.data = data
        this.orcamento = orcamento
    }

}