# DecolaTech 2025
Java RESTFul API criada para DecolaTech 2025

## Diagrama de Classe

```mermaid
classDiagram
    class Client {
        +String name
        +Acount acount
        +List~Feature~ features
        +Card card
        +List~News~ news
    }

    class Acount {
        +String number
        +String agency
        +String balance
        +String limit
        +String manager
    }

    class Feature {
        +String icon
        +String description
    }

    class Card {
        +String number
        +String limit
    }

    class News {
        +String icon
        +String description
    }

    Client "1"* -- "1" Acount
    Client "1"* -- "n" Feature
    Client "1"* -- "1" Card 
    Client "1"* -- "n" News 
```
