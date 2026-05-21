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

#### 🧩 Conceitos de POO Aplicados

* **Herança & Abstração:** Classe mãe `Asset` fornecendo a base para as especializações `Stock`, `RealEstateFund` e `FixedIncome`.
* **Polimorfismo:** Processamento dinâmico de uma `List<Asset>`, onde o sistema itera sobre a coleção e cada objeto executa sua própria lógica de cálculo em tempo de execução.
* **Interfaces:** Implementação do contrato `Reportable`, garantindo que todos os ativos sigam estritamente um padrão unificado de exibição de dados.

#### 🛡️ Programação Defensiva & Resiliência

* **Precisão Numérica:** Uso de `BigDecimal` para cálculos monetários, eliminando completamente as imprecisões de arredondamento do tipo `double`.
* **Imutabilidade:** Aplicação do modificador `final` em coleções para proteger referências de memória contra modificações acidentais.
* **Validação de Estado:** Filtro rigoroso de entradas (nomes e valores) disparando `IllegalArgumentException` para evitar dados corrompidos no sistema.
* **Tratamento de Erros:** Estrutura robusta de `try-catch-finally`, garantindo uma experiência amigável para o usuário em caso de falhas e o fechamento seguro de sessões.



---

## 📂 Estrutura do Repositório

```bash
├── .gitignore                      # Filtro de arquivos binários e configurações de IDE
├── README.md                       # Documentação da jornada técnica
└── 01-Foundations-OOP/
    └── java-poo-relationships-and-association/src/
    └── java-poo-interface-and-aggregation/src/
└── 02-Advanced-OOP/
    └── src/   # Ativos financeiros: Asset, Stock, Investor, etc.

```

---

## 🔜 Próximo Passo: Collections & Stream API 🌊

O próximo passo para elevar esse projeto para um nível superior é abandonar loops manuais e abraçar o poder funcional do Java.

* **Java Streams:** Filtrar e somar ativos de forma declarativa.
* **Lambda Expressions:** Reduzir a verbosidade do código.
* **Persistence:** Salvar e carregar os dados do investidor em arquivos `.txt` ou `.csv` no Fedora.

**[🔗 Repositório Anterior: java-backend-foundations](https://github.com/JorgeH-Tec/java-backend-foundations)**

---

## 📫 Contato

* Email: **jorge.paiv4@gmail.com**
* LinkedIn: [Jorge Henrique](https://www.linkedin.com/in/jorge-henrique-16b567263/)
