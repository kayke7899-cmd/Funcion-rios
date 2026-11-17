# 👨‍💼 Funcionários

Sistema de console em **Java** para cadastro de funcionários e aplicação de aumentos salariais, desenvolvido como projeto de estudo de **Programação Orientada a Objetos (POO)**.

![Java](https://img.shields.io/badge/Java-25-orange?logo=openjdk&logoColor=white)
![VS Code](https://img.shields.io/badge/VS%20Code-007ACC?logo=visualstudiocode&logoColor=white)

---

## 📖 Sobre o projeto

A aplicação permite cadastrar funcionários via terminal, exibir seus dados e aplicar aumentos salariais de duas formas: por **percentual** ou por **valor fixo com motivo**. O foco do projeto é praticar conceitos fundamentais de POO em Java:

- **Encapsulamento**: atributos privados dentro da classe `Funcionarios`.
- **Sobrecarga de construtores**: criação de um funcionário sem salário (iniciando em zero) ou com salário inicial.
- **Sobrecarga de métodos**: `aumentarSalario` aceita um percentual, ou um valor e o motivo do aumento.
- **Entrada de dados** com `Scanner` e saída com a classe `IO`.

## ✨ Funcionalidades

- Cadastro de funcionários com nome, matrícula, cargo e salário
- Exibição formatada dos dados de cada funcionário
- Aumento salarial por percentual (ex.: 10%)
- Aumento salarial por valor fixo, com registro do motivo

## 🗂️ Estrutura do projeto

```
Funcionarios/
└── funcionarios/
    ├── Funcionarios.java            # Classe modelo (atributos, construtores e métodos)
    └── Principal_funcionarios.java  # Classe principal com o fluxo de interação
```

### Classe `Funcionarios`

| Atributo    | Tipo     | Descrição                 |
|-------------|----------|---------------------------|
| `nome`      | `String` | Nome do funcionário       |
| `matricula` | `String` | Matrícula                 |
| `cargo`     | `String` | Cargo ocupado             |
| `salario`   | `double` | Salário em reais          |

| Método                                          | Descrição                                      |
|-------------------------------------------------|------------------------------------------------|
| `Funcionarios(nome, matricula, cargo)`          | Construtor com salário iniciando em zero       |
| `Funcionarios(nome, matricula, cargo, salario)` | Construtor completo                            |
| `mostrarDados()`                                | Exibe os dados do funcionário no console       |
| `aumentarSalario(percentual)`                   | Aumenta o salário em um percentual             |
| `aumentarSalario(valor, motivo)`                | Soma um valor fixo ao salário, informando o motivo |

## 🛠️ Tecnologias

- [Java](https://openjdk.org/) (JDK 25 ou superior, necessário para a classe `IO`)
- [Visual Studio Code](https://code.visualstudio.com/) com o [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)

## 🚀 Como executar

### Pré-requisitos

- JDK 25 ou superior instalado (`java -version` para conferir)
- Git (opcional, para clonar o repositório)

### Pelo terminal

```bash
# Clonar o repositório
git clone https://github.com/kayke7899-cmd/Funcionarios.git
cd Funcionarios

# Compilar
javac funcionarios/*.java

# Executar
java funcionarios.Principal_funcionarios
```

### Pelo VS Code

1. Abra a pasta do projeto no VS Code.
2. Instale o **Extension Pack for Java**, caso ainda não tenha.
3. Abra o arquivo `Principal_funcionarios.java`.
4. Clique em **Run** acima do método `main`, ou pressione `F5`.

## 💻 Exemplo de uso

```
=== Cadastro do Funcionário (com salário inicial) ===
Nome:Maria Silva
Matrícula:1001
Cargo:Analista
Salário:3000
Nome: Maria Silva
Matrícula: 1001
Cargo: Analista
Salário...: R$3000.0
--------------------------------------------------
=== Aumento salarial do funcionário 1 ===
Digite o percentual de aumento:10
Aumento salarial de 10.0% aplicado ao funcionário Maria Silva
Nome: Maria Silva
Matrícula: 1001
Cargo: Analista
Salário...: R$3300.0
--------------------------------------------------
```



## 👤 Autor

**Kayke Augusto Martins Araujo**

- GitHub: [@kayke7899-cmd](https://github.com/kayke7899-cmd)
- LinkedIn: _adicione o link do seu perfil_

---

Projeto desenvolvido para fins educacionais.
