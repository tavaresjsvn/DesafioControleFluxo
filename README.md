# Desafio de Controle de Fluxo em Java

Este projeto foi desenvolvido como parte do bootcamp Santander 2025 - Back-End com Java na DIO, com o objetivo de praticar conceitos fundamentais de controle de fluxo, estruturas de repetição e tratamento de exceções em Java.

## Descrição

O programa realiza uma contagem entre dois números inteiros informados pelo usuário via terminal. A lógica funciona da seguinte forma:

- O usuário informa dois valores inteiros.
- O sistema imprime uma sequência numerada da diferença entre esses dois valores.
- Caso o primeiro valor seja maior que o segundo, o programa lança uma exceção personalizada chamada `ParametrosInvalidosException` com a mensagem:
 ``` 
  "O segundo parâmetro deve ser maior que o primeiro"
  ```

## Estrutura do Projeto

- `Main.java`: classe de entrada do programa, onde ocorre a leitura dos dados e chamada da lógica de contagem.
- `Contador.java`: classe responsável por conter o método `contar`, que implementa a lógica principal do desafio.
- `ParametrosInvalidosException.java`: classe que representa a exceção personalizada usada para validação de entrada.

## Conceitos Aplicados

- Estrutura de repetição com `for`
- Uso da classe `Scanner` para leitura de dados
- Lançamento e tratamento de exceções com `try/catch`
- Criação de exceção personalizada

## Autor

Projeto desenvolvido por [Josevan Tavares](https://github.com/tavaresjsvn) durante o bootcamp Santander 2025 - Back-End com Java na DIO.