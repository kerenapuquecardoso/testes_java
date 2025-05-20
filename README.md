# 🧪 Projeto de Testes de Caixa Preta – Engenharia de Software

Este repositório contém a implementação de testes de **caixa preta** desenvolvidos na disciplina de **Testes de Software**, no 4° ano do curso de **Engenharia de Software** do **IFPR - Campus Paranavaí**.

## 📌 Descrição

O projeto tem como objetivo aplicar a técnica de **teste de caixa preta** para verificar a conformidade funcional de dois sistemas distintos:

1. **Cálculo do Calendário Gregoriano**  
   Avaliação de anos bissextos, validade de datas e transições entre meses e anos no calendário gregoriano.

2. **Cálculo do Imposto de Renda Pessoa Física (IRPF)**  
   Validação do cálculo do imposto de renda com base nas faixas salariais da legislação brasileira vigente.

Os testes foram implementados utilizando a linguagem **Java**, com foco na verificação das saídas esperadas a partir de diferentes entradas, sem considerar a lógica interna dos sistemas (característica típica do teste de caixa preta).

---

## 🧠 O Que é Teste de Caixa Preta?

O **teste de caixa preta** é uma técnica de teste de software baseada na análise das **funcionalidades do sistema**, **sem o conhecimento do código-fonte ou da estrutura interna** da aplicação. O objetivo é verificar se, para uma dada entrada, a saída obtida está de acordo com o comportamento esperado.

Nesta abordagem, os testadores se concentram em **entradas válidas e inválidas**, **saídas esperadas** e no comportamento do sistema em resposta a diferentes cenários, independentemente de como essa lógica foi implementada internamente.

> 🔎 *É como testar um aparelho eletrônico: você interage com os botões (entradas) e verifica se o que acontece (saída) está correto, sem abrir o aparelho para ver os circuitos (código).*

---

## 🧩 O Que são Classes de Equivalência?

**Classes de equivalência** são uma técnica utilizada no teste de caixa preta para **reduzir o número de casos de teste**, garantindo **boa cobertura de cenários**. A ideia é dividir o domínio de entradas em grupos de dados que o sistema trata de forma semelhante, ou seja, **conjuntos de valores que produzem o mesmo comportamento esperado**.

Esses grupos são chamados de **classes de equivalência**, e normalmente são divididos em:

- ✅ **Classes válidas**: entradas que devem ser aceitas e produzir saídas corretas.
- ❌ **Classes inválidas**: entradas que devem ser rejeitadas ou tratadas com mensagens de erro.

> 💡 A premissa é que **testar um valor de cada classe** é suficiente para representar o comportamento daquela categoria de dados.
