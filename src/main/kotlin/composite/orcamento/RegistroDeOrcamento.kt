package composite.orcamento

import composite.http.HttpAdapter

class RegistroDeOrcamento(private val http: HttpAdapter) {

    fun registrar(orcamento: Orcamento) {
        if (!orcamento.isFinalizado()) {
            throw Throwable("Orcamento nao finalizado!")
        }
        val url = "https://example.com/"
        val dados =
            mapOf<String, Any>(Pair("valor", orcamento.getValor()), Pair("quantidade", orcamento.getQuantidadeItens()))
        http.post(url, dados)
    }
}