# Behavioral Design Patterns

Padrões comportamentais são voltados aos algoritmos e a designação de responsabilidades entre objetos.

## Strategy

Quando há um conjunto de operações *if* que tratam do mesmo assunto, pode-se fazer uso do padrão de projeto *strategy*.
A sua ideia consiste em extrair o que há de comum para uma interface e fazer com o contexto dependa da interface. Dessa forma, 
todas as classes que o implementam tem métodos em comum, mas cada uma vai implementar de formas diferentes. Ao usar o algoritmo 
será passado a classe concreta que faz sentido no contexto, sem a necessidade de fazer uso de vários *if*. É passado a estratégia direto.

No exemplo da diferenças aplicando o padrão e não, do link abaixo, é possível notar que antes tinha um *if* para cada tipo de desconto. Mas ao passo que o desconto se torna uma interface, cada tipo de de desconto específico passa a aplicar o cálculo de forma específica. 
E no contexto onde estaria a cadeia de *if* passa a chamar o método da inteface que, por sua vez, chamará a classe concreta que o implementa por trás.

[Diferenças aplicando padrão e sem aplicar](https://github.com/opatrickmota/design-patterns/commit/ef882fb2e47e05867b49054dd5c92fe232f7a1eb)

[Explicação no Refactoring Guru](https://refactoring.guru/design-patterns/strategy)

## Chain of Responsibility

Nesse padrão é construido uma cadeia de responsabilidades que serão chamadas afim de atender ao contexto, 
se um nó não atender ao contexto será chamado o próximo e assim por diante.

Ele pode ser utilizado em contextos onde a utilização do *strategy* não consegue ser aplicado como, por exemplo, em casos em que não tem 
como mandar a estratégia que será utilizada, estratégia comum a ponto de ser possível abstrair para uma interface. Dessa forma, cria-se 
uma classe para cada condicional dos *ifs*. Nessas classes haverá uma variável para chamar o próximo nó da cadeia casso esse não atenda, e assim 
por diante. 

[Diferenças aplicando padrão e sem aplicar](https://github.com/opatrickmota/design-patterns/commit/dfcf44d29cbbf7d06ea1cd7e4a09d6dcb816f6fe)

[Explicação no Refactoring Guru](https://refactoring.guru/design-patterns/chain-of-responsibility)

## Template Method

O padrão Template Method favorece o reaproveitamento de códigos comuns entre classes, evitando assim duplicações de códigos. Dessa forma, na
classe mãe há um método concreto que implementa a lógica que antes do *template method* seria repetida em todas classes filhas.

[Diferenças aplicando padrão e sem aplicar](https://github.com/opatrickmota/design-patterns/commit/81db188677da0298229305cf0461306fd0359b5b)

[Explicação no Refactoring Guru](https://refactoring.guru/design-patterns/template-method)

## State

Essa padrão surge igual ao *strategy* para resolver a questão dos muitos *ifs*. O *state* é utilizado para representar os diferentes estados que 
o objeto pode ter. E se para executar uma tarefa dependemos do estado do objeto podemos delegar a chamada desse método para a classe que representa 
esse estado atual.

[Diferenças aplicando padrão e sem aplicar](https://github.com/opatrickmota/design-patterns/commit/f7c11ebf1de0477494f099a42bdffb7fe6319bb4)

[Explicação no Refactoring Guru](https://refactoring.guru/design-patterns/state)

## Command

Separa a camada da interface gráfica do usuário da camada lógica. Os comandos que são comuns a várias classes do mesmo tipo devem implementar uma mesma interface que contém esse comando.

[Diferenças aplicando padrão e sem aplicar](https://github.com/opatrickmota/design-patterns/commit/3caf173df8d64a2d0c1c014ef0abfbe81ac7976e)

[Explicação no Refactoring Guru](https://refactoring.guru/design-patterns/command)

## Observer

Notificar vários objetos sobre a mudança de algo. Quando a mudança de estado de um objeto necessita que outros objetos mudem também.

[Diferenças aplicando padrão e sem aplicar](https://github.com/opatrickmota/design-patterns/commit/464dabcd679ad93769961ad4d6dc3b37d1b09ecc)

[Explicação no Refactoring Guru](https://refactoring.guru/design-patterns/observer)


# Structural Design Patterns

## Adapter

Esse padrão permite que você defina uma classe intermediária que servirá como ponte entre a classe de serviço com a classe antiga/ou que pode ser
modificada constantemente, dependendo aqui da interface e não da implementação.

[Diferenças aplicando padrão e sem aplicar](https://github.com/opatrickmota/design-patterns/commit/84f16b1a8adba8bf9a12aec2b40e75203e0d21c5)

[Explicação no Refactoring Guru](https://refactoring.guru/design-patterns/adapter)

## Decorator

Permite adiciona novos comportamentos aos objetos sem quebrar comportamentos antigos. No final, acaba sendo criado uma cadeia de objetos que
receberm objetos do mesmo tipo. Não é um padrão bonito.

[Diferenças aplicando padrão e sem aplicar](https://github.com/opatrickmota/design-patterns/commit/714dba6123b4fd8682fd0c74255d75c59369162b)

[Explicação no Refactoring Guru](https://refactoring.guru/design-patterns/decorator)


## Composite

Utilizamos essa padrão quando queremos de alguma forma que um objeto seja composto por outro do mesmo tipo. No exemplo abaixo, temos que
podemos utilizar o orcamento antigo para compor o novo orcamento. Dessa forma, podemos trabalhar e acessar os dados de objetos do 
mesmo tipo, percorrendo seus dados e utilizando o que é necessário. É um padrão bem parecido com o Decorator.

É necessário um trabalho para entender o que há de comum entre os objetos para ser implementado uma interface. Depois desse trabalho inicial, 
um objeto já se torna capaz de receber outro do mesmo tipo para usar dados comuns necessários para a execução de uma tarefa.

[Diferenças aplicando padrão e sem aplicar](https://github.com/opatrickmota/design-patterns/commit/457589360a433d2d316a6e8c21e7c293a7e40fe0)

[Explicação no Refactoring Guru](https://refactoring.guru/design-patterns/composite)

## Facade

Atua como uma fachada, escondendo detalhes internos da implementação. Dessa forma uma classe não precisa saber o que é feito por de baixo dos panos, 
ela apenas chamada um método que irá executar tudo o que é necessário para o funcionamento do serviço, na ordem correta e etc.

Vimos isso sendo implementado quando estudavamos sobre o padrão observer. A chamada do **_handler.executar_** no método main é uma fachada, ela 
esconde detalhes da implementação.

[Diferenças aplicando padrão e sem aplicar](https://github.com/opatrickmota/design-patterns/commit/464dabcd679ad93769961ad4d6dc3b37d1b09ecc)

[Explicação no Refactoring Guru](https://refactoring.guru/design-patterns/facade)

## Proxy

Atua como intermediário em um serviço, podendo ser usando como cache, que é o exemplo abaixo. Outra forma de se fazer um cache dos dados em kotlin é 
com inicialização _**lazy**_, que a partir da segunda chamada mantem os dados em cache sem fazer a chamada a outro recurso para obter o dado novamente.

Para simular um demora de uma chamada para outra foi utilizado o _**Thread.sleep()**_, que na primeira chamada atrasa a entrega do recurso, 
mas a partir da segunda tem-se que o valor já está em cache.

[Diferenças aplicando padrão e sem aplicar](https://github.com/opatrickmota/design-patterns/commit/cba04680563b7cecc609f706559c1bacbeaedcaf)

[Explicação no Refactoring Guru](https://refactoring.guru/design-patterns/proxy)
