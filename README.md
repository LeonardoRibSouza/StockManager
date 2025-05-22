# Gerenciador de Estoque - StockMaster

Gerenciador de estoque simples desenvolvido em Java para controle eficiente de produtos, entradas, saídas e estoque mínimo.

---

## Sobre o Projeto

Este sistema permite o cadastro, gerenciamento e controle de produtos em estoque. Possui funcionalidades para adicionar e remover quantidades, listar produtos, remover produtos e gerar relatórios do estoque atual.

Ideal para pequenas empresas ou para aprendizado de programação Java com foco em manipulação de coleções e entrada de dados via terminal.

---

## Funcionalidades

- Cadastrar novos produtos com nome, preço, quantidade e quantidade mínima desejada.
- Listar todos os produtos cadastrados com detalhes.
- Adicionar quantidade a um produto existente.
- Remover quantidade de um produto.
- Remover um produto do estoque pelo ID.
- Gerar relatório detalhado do estoque atual com alertas para produtos abaixo da quantidade mínima ou fora de estoque.

---

## Estrutura do Projeto

- `GenrenciadorDeEstoque.java` — Classe principal com menu interativo no terminal.
- `SistemaDeEstoque.java` — Classe que gerencia a lógica do estoque e operações.
- `Produto.java` — Classe modelo que representa os produtos com atributos e métodos getters/setters.

---

## Tecnologias Utilizadas

- Java 11+
- Console para interação com o usuário
- IDE Eclipse (recomendada)

---

## Como Usar

1. **Clone este repositório para sua máquina local**, usando o comando abaixo no terminal ou prompt de comando:

```bash
git clone https://github.com/seuusuario/nome-do-repositorio.git