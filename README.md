# Java Backend: OOP Evolution Journey 🚀

> **Status:** 🏗️ Em desenvolvimento (Evolução Contínua)

Este repositório documenta minha progressão técnica na **Orientação a Objetos (POO)**. O objetivo é transformar conceitos teóricos em sistemas funcionais, modulares e resilientes, preparando a base para projetos futuros em **Spring Boot**.

Todo o desenvolvimento é realizado em ambiente **Linux (Fedora)**, utilizando **Maven** para gestão de dependências.

---

## 📅 Linha do Tempo de Projetos

### 1. Ultra Combat Simulator (Agregação & Encapsulamento) 🥊
O primeiro marco foca no relacionamento entre classes (Agregação) e na proteção do estado dos objetos.
Entendido. Foco total em objetividade e clareza técnica:

- **Conceitos Aplicados:**
    - **Encapsulamento:** Atributos privados para garantir a integridade dos dados.
    - **Guard Clauses:** Validação precoce via `IllegalArgumentException`.
    - **Exceções:** Uso de `try-catch` para maior resiliência do sistema.
    - **Random:** Atributo `final` para otimização de recursos.
    - **Switch Expressions:** Sintaxe moderna (`->`) para controle de fluxo.



### 2. Book Management System (Interfaces & Agregação) 📚

Neste projeto, introduzo **Contratos (Interfaces)** para padronizar comportamentos entre objetos distintos.

  - **Conceitos Aplicados:**
      - **Interfaces:** Contrato `Publication` com métodos obrigatórios (`open`, `browse`, etc).
      - **Implementação:** Classe `Book` regida por contrato formal de comportamento.
      - **Agregação:** Associação funcional entre as classes `Person` e `Book`.
      - **Lógica de Estado:** Regras de negócio baseadas no status interno do objeto.



---

Você pretende aplicar esse mesmo estilo de escrita técnica e direta nas futuras seções de **Herança** e **Polimorfismo**?
---

## 📂 Estrutura do Repositório
```bash
├── .gitignore                      # Filtro de arquivos binários e configurações de IDE (.iml)
├── README.md                       # Documentação da jornada técnica
└── java-poo-relationships-and-association/
    └── src/ # Projeto 1: Simulador de Combate
        ├── CombatEvent.java (main)
        ├── Fighter.java
        └── Fight.java
└── java-poo-interface-and-aggregation/
    └── src/ # Projeto 2: Simulador de posse de livros
        ├── Simulation.java (main)
        ├── Book.java
        ├── Person.java
        └── Publication.java
```

---

## 🔜 Próximo Milestone: Herança (Inheritance)
O próximo desafio será aplicar o conceito de **Herança** e **Polimorfismo**. A ideia é criar especializações de classes, reduzindo a duplicação de código e permitindo comportamentos mais complexos.

**[🔗 Repositório Anterior: java-backend-foundations](https://github.com/JorgeH-Tec/java-backend-foundations)**

---

## 📫 Contato

* Email: **jorge.paiv4@gmail.com**
* LinkedIn: [Jorge Henrique](https://www.linkedin.com/in/jorge-henrique-16b567263/)
