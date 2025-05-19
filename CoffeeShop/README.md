## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
# ☕ CoffeeShop Design Patterns

Este projeto foi desenvolvido como parte de um desafio prático para aplicar conceitos de **Padrões de Projeto (Design Patterns)** usando **Java puro**.

---

## 🎯 Objetivo do Projeto

Simular um sistema simples de pedidos em uma cafeteria, permitindo que o cliente escolha uma bebida e realize o pagamento por diferentes métodos. O projeto aplica padrões clássicos do GoF para estruturar o código de forma reutilizável, escalável e de fácil manutenção.

---

## 🧠 Padrões de Projeto Utilizados

1. **Singleton**
   - Garante que o sistema de pedidos tenha apenas uma instância ativa (classe `SistemaPedidos`).

2. **Factory Method**
   - Cria objetos do tipo `Bebida` de forma flexível conforme a escolha do cliente (`BebidaFactory`).

3. **Strategy**
   - Permite selecionar diferentes métodos de pagamento em tempo de execução (`PagamentoStrategy`, `CartaoCredito`, `Dinheiro`).

---

## 🛠️ Como Executar o Projeto

### 1. Clone o repositório

```bash
git clone https://github.com/seu-usuario/coffee-shop-design-patterns.git
cd coffee-shop-design-patterns

