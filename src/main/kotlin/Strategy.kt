import strategy.imposto.CalculadoraImpostos
import strategy.imposto.ICMS
import strategy.imposto.ISS
import strategy.orcamento.Orcamento
import java.math.BigDecimal

fun main(args: Array<String>) {

    /* Strategy */
    val orcamento = Orcamento(BigDecimal("100"))
    val calculadora = CalculadoraImpostos()

    println("-------- STRATEGY --------")
    println("Strategy elimina a dependencia da classe, sendo dependente somente da interface.")
    println("Dessa forma, nao eh necessario mudar a classe novamente se surgir um novo imposto")
    println("Basta criar uma classe para esse novo imposto que implementa a mesma interface")
    println("Imposto do ICMS: " + calculadora.calcular(orcamento, ICMS()))
    println("Imposto do ISS: " + calculadora.calcular(orcamento, ISS()))
    println("-----------------------")

    /* ------------ */
}