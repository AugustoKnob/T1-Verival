# Trabalho 1 — Testes de Mutação com PIT

Projeto desenvolvido para a disciplina de **Verificação e Validação de Software** com o objetivo de demonstrar, na prática, a utilização de **testes de mutação** utilizando a ferramenta **PIT (Pitest)** em um projeto Java com Maven e JUnit 5.

## 📚 Objetivo do Trabalho

O trabalho propõe a exploração do conceito de **teste de mutação**, técnica utilizada para avaliar a efetividade de testes automatizados existentes em um sistema.

Diferente dos testes tradicionais, o teste de mutação não busca diretamente encontrar defeitos no código, mas verificar se os testes automatizados são capazes de detectar pequenas alterações propositalmente inseridas no código-fonte (mutantes).

## 🧪 O que é Teste de Mutação?

Teste de mutação é uma técnica de teste baseada na criação de pequenas modificações automáticas no código-fonte, chamadas de **mutantes**.

Exemplos de mutações:

- Alterar `>` para `>=`
- Trocar `+` por `-`
- Inverter retornos booleanos
- Remover chamadas de métodos

Os testes automatizados são então executados contra esses mutantes.

### Resultado esperado

- ✅ **Mutante morto (killed)**: os testes falharam → os testes são eficazes.
- ❌ **Mutante sobrevivente (survived)**: os testes passaram → existe fragilidade nos testes.

## 🎯 Objetivo da Demonstração

Este projeto demonstra:

- Configuração do PIT em um projeto Maven;
- Execução de testes de mutação;
- Geração de relatórios;
- Identificação de mutantes sobreviventes;
- Avaliação da qualidade dos testes automatizados.

---

# 🛠️ Tecnologias Utilizadas

- Java 25
- Maven
- JUnit 5
- PIT Mutation Testing

---

# 📁 Estrutura do Projeto

```text
src
├── main
│   └── java
│       └── t1
│           └── GerenciamentoEstoqueCafe.java
│
└── test
    └── java
        └── t1
            └── GerenciamentoEstoqueCafeTest.java