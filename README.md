# DecolaTech 2025
Java RESTFul API criada para DecolaTech 2025

## Diagrama de Classe

```mermaid
classDiagram
    class Correntista {
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

    Correntista "1"* -- "1" Acount
    Correntista "1"* -- "n" Feature
    Correntista "1"* -- "1" Card 
    Correntista "1"* -- "n" News 
```
