// 3) Compare dois produtos

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        produto produtoUm = new produto();
        produtoUm.setNome("Celular1");
        produtoUm.setDescrição("5g com 256gb de memória");
        produtoUm.setPreçoUnitario(2000);
        produtoUm.setQuantidade(10);

        produto produtoDois = new produto();
        produtoDois.setNome("Celular2");
        produtoDois.setDescrição("4g com 64gb de memória");
        produtoDois.setPreçoUnitario(1500);
        produtoDois.setQuantidade(20);

        if (produtoUm.equals(produtoDois)) {
            System.out.println("Produtos Duplicados");
        } else System.out.println("Produtos diferentes");

// 4) Imprimir Dados do produto

        produtoUm.exibeProduto();

// 6 7 ) Restringindo visibilidade e criando instancia de produto obrigatorio

        int menu = 0;
        int qualProduto = 0;

        String menus;
        menus = "\n -----------------------------\n Selecione a opção desejada\n" +
                "3 - Selecionar produto\n" +
                "4 - Sair";

        String opcao;
        opcao = "Digite o numero do produto";

        Scanner opcoes = new Scanner(System.in);
        Scanner numeroProduto = new Scanner(System.in);

        while (menu != 4) {
            System.out.println(menus);
            menu = opcoes.nextInt();

            if (menu == 3) {
                System.out.println(opcao);
                    qualProduto = numeroProduto.nextInt();
            } if (qualProduto == 1) {
                produtoUm.exibeProduto();
            } else if (qualProduto == 2) {
                produtoDois.exibeProduto();
            } else {
                System.out.println("Opção invalida");
            }
        }


    }

}

