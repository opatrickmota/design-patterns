package decorator.http

interface HttpAdapter {
    fun post(url: String, dados: Map<String, Any>)
}