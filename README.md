# Fundamentos e Projetos em Java

![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?logo=openjdk&logoColor=white)
![Tests](https://img.shields.io/badge/testes-4%20cenários-2EA44F)
![Status](https://img.shields.io/badge/status-em%20evolução-6C63FF)

Coleção de exercícios e projetos desenvolvidos durante meus estudos de Java.
Os exemplos praticam entrada de dados, operadores, condicionais, repetições,
`switch` e orientação a objetos. O repositório também inclui um sistema
bancário de terminal com regras de negócio e testes automatizados simples.

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

- Consulta de saldo e limite disponível;
- Depósitos, saques e pagamento de boletos;
- Uso de cheque especial;
- Cobrança de taxa sobre o valor utilizado;
- Validação de valores e saldo disponível;
- Quatro cenários de teste executados com `assert`.

### Regras do cheque especial

- Depósito inicial de até R$ 500: limite de R$ 50;
- Depósito inicial acima de R$ 500: limite de 50% do depósito;
- Operações podem utilizar o saldo e o limite disponível;
- O uso do cheque gera uma taxa de 20% sobre o valor utilizado;
- A taxa pendente é descontada quando o saldo é recomposto.

## Como executar

Requer JDK 17 ou superior.

```bash
javac -d out src/*.java
java -cp out Tabuada
```

Troque `Tabuada` pelo nome da classe que deseja executar.

### Executar o sistema bancário

```bash
javac -d out projetos/sistema-bancario/src/*.java
java -cp out Banco
```

### Executar os testes do sistema bancário

```bash
javac -d out projetos/sistema-bancario/src/*.java projetos/sistema-bancario/tests/*.java
java -ea -cp out ContaBancariaTest
```

O parâmetro `-ea` habilita as verificações feitas com `assert`.

## Organização

```text
java-fundamentos/
├── src/                         # 13 exercícios independentes
└── projetos/
    └── sistema-bancario/
        ├── src/
        │   ├── Banco.java
        │   └── ContaBancaria.java
        └── tests/
            └── ContaBancariaTest.java
```

Em `src`, cada classe com método `main` representa um exercício independente.
`Pessoa.java` e `ExemploPessoa.java` formam o exemplo introdutório de POO.

## Objetivo

Registrar minha evolução na linguagem Java, partindo de exercícios pequenos e
avançando para projetos com regras de negócio, organização e testes.

## Autor

Desenvolvido por [Luiz Othávio](https://github.com/luizww).
