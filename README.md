# Fundamentos e Projetos em Java

![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/status-em%20evolução-6C63FF)

Coleção de exercícios e projetos desenvolvidos durante meus estudos de Java.
Os exemplos praticam entrada de dados, operadores, condicionais, repetições,
`switch` e orientação a objetos. O repositório também inclui uma versão inicial
de um sistema bancário de terminal criada durante meus estudos de POO.

## Exercícios disponíveis

- Saudação e cálculo aproximado de idade;
- Área de quadrado e triângulo;
- Diferença entre idades;
- Tabuada;
- Calculadora de IMC;
- Verificação de condição para dirigir;
- Dia da semana com `switch`;
- Números pares e ímpares em um intervalo;
- Divisão com validação;
- Repetição com `while`;
- Classe `Pessoa` com encapsulamento.

## Projeto em destaque: sistema bancário

O projeto localizado em `projetos/sistema-bancario` simula operações básicas
de uma conta bancária:

- Consulta de saldo e cheque especial;
- Depósitos, saques e pagamento de boletos;
- Liberação do cheque especial após o primeiro depósito;
- Menu interativo executado no terminal;
- Uso de atributos privados, getters, setters e métodos.

O código foi mantido próximo da versão que escrevi durante o aprendizado. Ele
representa meus primeiros passos com encapsulamento e ainda possui regras
simplificadas, como permitir que saques deixem o saldo negativo.

## Como executar

Requer JDK 17 ou superior.

```bash
javac -d out src/*.java
java -cp out Tabuada
```

Troque `Tabuada` pelo nome da classe que deseja executar.

### Executar o sistema bancário

```bash
javac -d out projetos/sistema-bancario/src/exercicios/*.java
java -cp out exercicios.Banco
```

## Organização

```text
java-fundamentos/
├── src/                         # 13 exercícios independentes
└── projetos/
    └── sistema-bancario/
        └── src/
            └── exercicios/
                ├── Banco.java
                └── Conta_bancaria.java
```

Em `src`, cada classe com método `main` representa um exercício independente.
`Pessoa.java` e `ExemploPessoa.java` formam o exemplo introdutório de POO.

## Objetivo

Registrar minha evolução na linguagem Java, partindo de exercícios pequenos e
avançando gradualmente para projetos com classes e encapsulamento.

## Autor

Desenvolvido por [Luiz Othávio](https://github.com/luizww).
