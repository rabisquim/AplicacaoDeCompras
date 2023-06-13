# Aplicação de Compras

Esta é uma aplicação simples em Java para realizar o lançamento de compras no cartão de crédito, através de interação com o terminal. 
O programa permite definir um limite para o cartão, adicionar itens à lista de compras e exibir as compras realizadas em ordem crescente de valor.

## Funcionalidades

- Definir o valor do limite do cartão
- Adicionar itens à lista de compras
- Verificar se o valor do item excede o limite do cartão
- Exibir o saldo atual do cartão
- Exibir as compras realizadas em ordem de valor

## Executando o programa

Para executar a aplicação, siga as instruções abaixo:

1. Compile o código-fonte utilizando um compilador Java, como o `javac`, por exemplo:
   ```
   javac Principal.java
   ```
2. Em seguida, execute o programa compilado com o comando `java`:
   ```
   java Principal
   ```
3. Siga as instruções no terminal para interagir com a aplicação. Informe o valor do limite do cartão, adicione itens à lista de compras e finalize a compra quando desejado.

## Exemplo de Uso

```
Informe o valor do Limite do Cartão (em R$): 
1000
Informe o [NOME] do item (ou 'sair' para finalizar): 
Maçã
Informe o valor do item (em R$): 
2
Item adicionado à lista de compras. Saldo do cartão: R$ 998.00

Informe o [NOME] do item (ou 'sair' para finalizar): 
Notebook
Informe o valor do item (em R$): 
1200
Limite do Cartão excedido. Saldo do cartão: R$ 998.00 

Informe o [NOME] do item (ou 'sair' para finalizar): 
Sair

COMPRAS REALIZADAS: 
========================================
Maçã - R$ 2.00
========================================
Saldo do cartão: R$ 998.00
========================================
```

## Autores

- Robson Paulo

## Observações

Este código foi desenvolvido como parte de um desafio do curso de Java da Alura.
