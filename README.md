# Java Backend: OOP Evolution Journey 🚀

> **Status:** ✅ Etapa de Herança/Polimorfismo Concluída

Este repositório documenta minha progressão técnica na **Orientação a Objetos (POO)**. O objetivo é transformar conceitos teóricos em sistemas funcionais, modulares e resilientes, preparando a base para projetos futuros em **Spring Boot**.

Todo o desenvolvimento é realizado em ambiente **Linux (Fedora)**.

---

## 📅 Linha do Tempo de Projetos

### 1. Combat System Simulator (Agregação & Encapsulamento) 🥊

Foco no relacionamento entre classes e na proteção do estado dos objetos.

### 2. Book Management System (Interfaces & Agregação) 📚

Introdução de contratos para padronizar comportamentos entre objetos distintos.

### 3. Financial Asset Manager (Herança & Polimorfismo) 💰

O marco mais complexo até aqui, simulando um sistema real de gestão de ativos financeiros.

* **Conceitos Aplicados:**
* **Herança & Abstração:** Classe mãe `Asset` fornecendo a base para `Stock`, `RealEstateFund` e `FixedIncome`.
* **Polimorfismo:** Processamento dinâmico de uma `List<Asset>` onde cada objeto executa sua própria lógica de cálculo.
* **Interfaces:** Contrato `Reportable` garantindo que todos os ativos sigam um padrão de exibição.
* **Programação Defensiva:**
* Uso de **`final`** em coleções para proteger referências.
* **`BigDecimal`** para precisão financeira absoluta (evitando erros de `double`).
* Validação rigorosa de nomes e valores com `IllegalArgumentException`.


* **Resiliência:** Estrutura completa de **`try-catch-finally`** para tratamento amigável de erros e finalização de processos.



---

## 📂 Estrutura do Repositório

```bash
├── .gitignore                      # Filtro de arquivos binários e configurações de IDE
├── README.md                       # Documentação da jornada técnica
└── 01-Foundations/
    └── java-poo-relationships-and-association/src/
    └── java-poo-interface-and-aggregation/src/
└── 02-Advanced-OOP/
    └── java-poo-inheritance/src/   # Ativos financeiros: Asset, Stock, Investor, etc.

```

---

## 🔜 Próximo Passo: Collections & Stream API 🌊

O próximo passo para tornar este projeto "nível sênior" é abandonar loops manuais e abraçar o poder funcional do Java.

* **Java Streams:** Filtrar e somar ativos de forma declarativa.
* **Lambda Expressions:** Reduzir a verbosidade do código.
* **Persistence:** Salvar e carregar os dados do investidor em arquivos `.txt` ou `.csv` no Fedora.

**[🔗 Repositório Anterior: java-backend-foundations](https://github.com/JorgeH-Tec/java-backend-foundations)**

---

## 📫 Contato

* Email: **jorge.paiv4@gmail.com**
* LinkedIn: [Jorge Henrique](https://www.linkedin.com/in/jorge-henrique-16b567263/)
