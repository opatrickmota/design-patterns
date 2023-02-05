# Behavioral Design Patterns

Padrões comportamentais são voltados aos algoritmos e a designação de responsabilidades entre objetos.

## Strategy

Quando há um conjunto de operações *if* que tratam do mesmo assunto, pode-se fazer uso do padrão de projeto *strategy*.
A sua ideia consiste em extrair o que há de comum para uma interface e fazer com o contexto dependa da interface. Dessa forma, 
todas as classes que o implementam tem métodos em comum, mas cada uma vai implementar de formas diferentes. Ao usar o algoritmo 
será passado a classe concreta que faz sentido no contexto, sem a necessidade de fazer uso de vários *if*. É passado a estratégia direto.

Um exemplo é o seguinte [link](https://github.com/opatrickmota/design-patterns/commit/ef882fb2e47e05867b49054dd5c92fe232f7a1eb) de código, 
que antes tinha um *if* para cada tipo de desconto. Mas ao passo que o desconto se torna uma interface, 
cada tipo de de desconto específico passa a aplicar o cálculo de forma específica. 
E no contexto onde estaria a cadeia de *if* passa a chamar o método da inteface que, por sua vez, chamará a classe concreta que o implementa por trás.

[Diferenças aplicando padrão e sem aplicar](https://github.com/opatrickmota/design-patterns/commit/ef882fb2e47e05867b49054dd5c92fe232f7a1eb)

## Chain of Responsibility

Nesse padrão é construido uma cadeia de responsabilidades que serão chamadas afim de atender ao contexto, 
se um nó não atender ao contexto será chamado o próximo e assim por diante.

Ele pode ser utilizado em contextos onde a utilização do *strategy* não consegue ser aplicado como, por exemplo, em casos em que não tem 
como mandar a estratégia que será utilizada, estratégia comum a ponto de ser possível abstrair para uma interface. Dessa forma, cria-se 
uma classe para cada condicional dos *ifs*. Nessas classes haverá uma variável para chamar o próximo nó da cadeia casso esse não atenda, e assim 
por diante. 

[Diferenças aplicando padrão e sem aplicar](https://github.com/opatrickmota/design-patterns/commit/dfcf44d29cbbf7d06ea1cd7e4a09d6dcb816f6fe)

## Template Method

O padrão Template Method favorece o reaproveitamento de códigos comuns entre classes, evitando assim duplicações de códigos. Dessa forma, na
classe mãe há um método concreto que implementa a lógica que antes do *template method* seria repetida em todas classes filhas.

[Diferenças aplicando padrão e sem aplicar](https://github.com/opatrickmota/design-patterns/commit/81db188677da0298229305cf0461306fd0359b5b)
