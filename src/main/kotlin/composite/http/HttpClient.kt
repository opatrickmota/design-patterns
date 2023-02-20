package composite.http

import java.net.URL

class HttpClient: HttpAdapter {
    override fun post(url: String, dados: Map<String, Any>) {
        try {
            val urlDaApi = URL(url)
            val connection = urlDaApi.openConnection()
            connection.connect()
            // segue implementando
        } catch (e: Throwable) {
            throw Throwable(e)
        }
    }
}