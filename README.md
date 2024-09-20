
# Design Patterns

![Design Patterns](https://refactoring.guru/images/patterns/content/visitor/visitor-2x.png)

Este repositório contém exemplos de diferentes padrões de design em Java. Cada padrão está implementado em um módulo separado, demonstrando como aplicar o padrão em cenários reais. Os padrões de design ajudam a resolver problemas comuns de software e facilitam a manutenção e evolução do código.

## 🎯 Objetivo

O objetivo deste repositório é fornecer uma referência prática para entender e implementar padrões de design em projetos Java. Cada exemplo está acompanhado de explicações e casos de uso para facilitar o aprendizado e aplicação no dia a dia.

## 📚 Padrões Implementados

### 1. [Builder Pattern](./builder-pattern)
O Builder Pattern permite a criação de objetos complexos passo a passo. Ele separa a construção do objeto de sua representação, permitindo a criação de diferentes representações do mesmo processo de construção.

- **Exemplo:** Construção de veículos como carros e caminhões, onde cada veículo é construído passo a passo.
- **Documentação:** [Refactoring Guru - Builder](https://refactoring.guru/design-patterns/builder)

### 2. [Adapter Pattern](./adapter-pattern)
O Adapter Pattern permite que classes com interfaces incompatíveis trabalhem juntas. Ele envolve uma classe que serve de intermediária entre duas classes para que possam se comunicar sem modificações.

- **Exemplo:** Integração de diferentes APIs de pagamento como PayPal e Mercado Pago em uma interface comum.
- **Documentação:** [Refactoring Guru - Adapter](https://refactoring.guru/design-patterns/adapter)

### 3. [Chain of Responsibility Pattern](./chain-of-responsibility-pattern)
O Chain of Responsibility Pattern permite que um pedido seja passado por uma cadeia de manipuladores até que um deles o processe. Ele desacopla o remetente do pedido dos seus receptores, permitindo que diferentes handlers tratem do pedido de maneiras diferentes.

- **Exemplo:** Sistema de autenticação com diferentes níveis de validação, como verificação de usuário e permissões.
- **Documentação:** [Refactoring Guru - Chain of Responsibility](https://refactoring.guru/design-patterns/chain-of-responsibility)

### 4. [Bridge Pattern](./bridge-pattern)
O Bridge Pattern permite que você desacople uma abstração de sua implementação, permitindo que ambos possam variar e evoluir independentemente. Ele facilita a combinação de várias implementações com várias abstrações, promovendo a flexibilidade e a reutilização de código.

- **Exemplo:** Implementação de diferentes tipos de transmissões (básica e avançada) em várias plataformas de streaming (YouTube, TwitchTV, Facebook) usando a mesma interface.
- **Documentação:** [Refactoring Guru - Bridge](https://refactoring.guru/design-patterns/bridge)

## 🚀 Como Usar

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/Marcoant007/desing-patterns.git
   ```
2. **Importe o projeto no IntelliJ IDEA ou em sua IDE preferida.**
3. **Navegue até o módulo do padrão que deseja explorar.**
4. **Execute a classe `Main` para ver o padrão em ação.

## 📂 Estrutura do Repositório

Cada padrão está organizado em um módulo separado:

```
design-patterns/
│
├── adapter-pattern/
│   ├── pom.xml
│   └── src/
│       ├── main/
│       └── test/
│
├── builder-pattern/
│   ├── pom.xml
│   └── src/
│       ├── main/
│       └── test/
│
├── chain-of-responsibility-pattern/
│   ├── pom.xml
│   └── src/
│       ├── main/
│       └── test/
│
├── bridge-pattern/
│   ├── pom.xml
│   └── src/
│       ├── main/
│       └── test/
│
└── pom.xml  <!-- POM principal agregador -->
```
