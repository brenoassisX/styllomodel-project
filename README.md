# Styllo Model - Sistema de Gestão de Varejo

> Projeto Integrado das disciplinas de Engenharia de Software e Sistemas de Informação.

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Maven](https://img.shields.io/badge/apache_maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)
![JUnit5](https://img.shields.io/badge/JUnit5-25A162?style=for-the-badge&logo=junit5&logoColor=white)

## 📄 Sobre o Projeto

O Styllo Model é um sistema desenvolvido para modernizar a gestão de uma microempresa de moda jovem. O objetivo principal é substituir controles manuais ("caderninho") por um sistema automatizado que garante integridade de dados e eficiência operacional.

O projeto foca na resolução de problemas como:
* Furos de estoque.
* Erros de precificação.
* Falta de métricas de vendas.

## 🚀 Funcionalidades Implementadas (Back-end)

O núcleo do sistema (`Produto.java`) implementa as regras de negócio essenciais para o varejo:

* ✅ **Gestão de Vendas:** Validação automática de estoque antes da baixa.
* ✅ **Controle de Estoque:** Reposição de mercadorias e prevenção de estoque negativo.
* ✅ **Precificação:** Cálculo automático de preços com desconto e validação de valores (impede preços negativos).
* ✅ **Segurança de Dados:** Encapsulamento e validação de entradas.

## 📂 Estrutura do Repositório

O projeto está organizado seguindo as boas práticas de Engenharia de Software:

* `src/main/java`: Código-fonte da aplicação (Regras de Negócio).
* `src/test/java`: Suíte de testes unitários (JUnit 5).
* `/documentacao`: Relatório técnico completo (PDF), Diagramas de Fluxo de Dados (DFD) e Matriz de Rastreabilidade.
* `/prototipo`: Arquivos HTML/CSS demonstrando a interface do usuário.

## 🛠️ Tecnologias Utilizadas

* Linguagem: Java (JDK 17)
* Gerenciamento de Dependências: Apache Maven
* Testes Automatizados: JUnit 5 (Jupiter)
* IDE Recomendada: Apache NetBeans / IntelliJ IDEA

## 🧪 Como Executar os Testes

Este projeto conta com uma cobertura de testes para garantir a qualidade e confiabilidade do sistema.

### Pré-requisitos
* Java JDK 17 ou superior instalado.
* Maven instalado (ou utilizar o Wrapper).

### Passo a Passo
1.  Clone o repositório:
    ```bash
    git clone [https://github.com/brenoassisX/styllomodel-project.git](https://github.com/brenoassisX/styllomodel-project.git)
    ```
2.  Acesse a pasta do projeto:
    ```bash
    cd styllomodel-project
    ```
3.  Execute os testes via terminal:
    ```bash
    mvn clean test
    ```

Saída Esperada:
```text
[INFO] Tests run: 10, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
