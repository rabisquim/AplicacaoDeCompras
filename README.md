# Aplicação de Compras

Esta é uma aplicação simples em Java para realizar o lançamento de compras no cartão de crédito, através de interação com o terminal. O programa permite definir um limite para o cartão, adicionar itens à lista de compras e exibir as compras realizadas em ordem crescente de valor.

## Funcionalidades

- Definir o valor do limite do cartão
- Adicionar itens à lista de compras
- Verificar se o valor do item excede o limite do cartão
- Exibir o saldo atual do cartão
- Exibir as compras realizadas em ordem de valor

## Classes

### Produtos

A classe `Produtos` representa um produto que pode ser adicionado à lista de compras. Ela possui os seguintes atributos:

- `nome` (String): nome do produto
- `preco` (double): preço do produto

A classe `Produtos` também possui os seguintes métodos:

- `Produtos(String nome, double preco)`: construtor que recebe o nome e o preço do produto e atribui os valores aos atributos correspondentes.
- `getNome()`: retorna o nome do produto.
- `getPreco()`: retorna o preço do produto.

### Cartao

A classe `Cartao` representa um cartão de crédito e possui um limite. Ela possui o seguinte atributo:

- `limite` (double): limite do cartão

A classe `Cartao` também possui o seguinte método:

- `Cartao(double limite)`: construtor que recebe o limite do cartão e atribui o valor ao atributo correspondente.
- `getLimite()`: retorna o limite do cartão.

## Executando o programa

Para executar a aplicação, siga as instruções no tópico "Executando o programa" no README anterior.

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

## Autores

- Robson Paulo

## Observações

Este código foi desenvolvido como parte de um desafio do curso de Java da Alura.
