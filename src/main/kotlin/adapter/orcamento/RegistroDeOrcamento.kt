package adapter.orcamento

class RegistroDeOrcamento {

    fun registrar(orcamento: Orcamento) {
        /* Chamada http para api externa */
        /* Temos varias opçoes, url connection, http client, biblioteca rest...
            Porem estaremos misturando a configuração da chamada com o registrar.
            Temos uma dependencia, devemos depender da abstracao inves da implementacao
        * */
    }
}