import adapter.http.HttpClient
import adapter.orcamento.Orcamento
import adapter.orcamento.RegistroDeOrcamento
import java.math.BigDecimal

fun main(args: Array<String>) {
    val orcamento = Orcamento(BigDecimal.TEN, 1)
    orcamento.aprovar()
    orcamento.finalizar()

    /* Posso mandar qualquer classe que implemente a interface HttpAdapter */
    val registro = RegistroDeOrcamento(http = HttpClient())
    registro.registrar(orcamento)
}