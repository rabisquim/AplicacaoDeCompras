package br.com.alura.aplicacaodecompras.principal;

import br.com.alura.aplicacaodecompras.modelos.Produtos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//@Robson Paulo | Jaraguá do Sul, SC - Brasil | 2023 | Alura

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Produtos> compras = new ArrayList<>();

        System.out.println("Informe o valor do Limite do Cartão (em R$): ");
        double limite = scan.nextDouble();
        scan.nextLine(); //Limpar o buffer do scanner

        while (true) {
            System.out.println("Informe o [NOME] do item (ou 'sair' para finalizar): ");
            String nome = scan.nextLine();

            if (nome.equals("sair")) {
                break;
            }
            System.out.println("Informe o valor do item (em R$: ");
            double valor = scan.nextDouble();
            scan.nextLine(); //Limpar o buffer do scanner

            if (valor > limite) {
                System.out.printf("Limite do Cartão excedido. Saldo do cartão: R$ %.2f ", limite);
                System.out.println();
                continue;
            }

            compras.add(new Produtos(nome, valor));
            limite -= valor;
            System.out.printf("Item adicionado à lista de compras. Saldo do cartão: R$ %.2f%n", limite);
            System.out.println();
        }
        //Ordenar as compras em ordem crescente de valor
        compras.sort((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco()));
        System.out.println();
        System.out.println("COMPRAS REALIZADAS: ");
        System.out.println("========================================");
        for (Produtos produto : compras) {
            System.out.printf("%s - R$ %.2f", produto.getNome(), produto.getPreco());
            System.out.println();

        }
        System.out.println("========================================");
        System.out.printf("Saldo do cartão: R$ %.2f%n", limite);
        System.out.println("========================================");

    }
}
