# DecolaTech 2025
Java RESTFul API criada para DecolaTech 2025

## Diagrama de Classe

```mermaid
classDiagram
    class Client {
        +String name
        +String manager
        +Account account
        +List~Feature~ features
        +Card card
        +List~News~ news
    }

    class Account {
        +String number
        +String agency
        +BigDecimal balance
        +BigDecimal limit
    }

    class Feature {
        +String icon
        +String description
    }

    class Card {
        +String number
        +BigDecimal limit
    }

    class News {
        +String icon
        +String description
    }

    Client "1"* -- "1" Account
    Client "1"* -- "n" Feature
    Client "1"* -- "1" Card 
    Client "1"* -- "n" News 
```
