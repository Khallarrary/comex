package br.com.famarcia;

import br.com.famarcia.modelo.Produto;
import br.com.famarcia.service.ProdutoService;
import br.com.famarcia.modelo.regraDeNegocioException;

import java.util.Scanner;
import java.util.Set;

public class Main {

    private static Scanner teclado = new Scanner(System.in).useDelimiter("\n");

    // Criar uma instância de ProdutoService
    private static ProdutoService service = new ProdutoService();

    public static void main(String[] args) {


        int opcao = exibirMenu();
        while (opcao != 5) {
            try {
                switch (opcao) {
                    case 1:
                        cadastrarProduto();
                        break;
                    case 2:
                        listarProduto();
                        break;
                    case 3:
                        editarProduto();
                        break;
                    case 4:
                        excluirProduto();
                        break;
                }
            } catch (regraDeNegocioException e) {
                System.out.println("Erro: " + e.getMessage());
                System.out.println("Pressione qualquer tecla e dê ENTER para voltar ao menu principal.");
                teclado.next();
            }
            opcao = exibirMenu();
        }
        System.out.println("Finalizando a aplicação.");


    }

    private static int exibirMenu() {
        System.out.println(""" 
                *** ----- FARMÁCIA - ESCOLHA UMA OPÇÃO:
                1 - Cadastrar produto.
                2 - Listar produto.
                3 - Editar Produto.
                4 - Apagar produto.
                5 - Sair. 
                *** ------------------------------- ***
                """);
        return teclado.nextInt();
    }

    //Criar um novo produto
    private static void cadastrarProduto() {
        System.out.println("Digite o id do produto:");
        var id = teclado.nextInt();

        System.out.println("Digite o preço do produto:");
        var preco = Integer.parseInt(teclado.next());

        System.out.println("Digite o nome do produto:");
        var nome = teclado.next();

        System.out.println("Digite o fabricante do produto:");
        var fabricante = teclado.next();

        service.abrir(new Produto(id, preco, nome, fabricante));

        System.out.println("Produto cadastrado com sucesso!");
        System.out.println("Pressione qualquer tecla e dê ENTER para voltar ao menu principal.");
        teclado.next();

    }

    //Listar produtos
    private static void listarProduto() {
        System.out.println("Listando produtos cadastrados:");
        Set<Produto> produtos = service.listarPodutosCadatrados();
        produtos.stream().forEach(System.out::println);

        System.out.println("Pressione qualquer tecla e dê ENTER para voltar ao menu principal.");
    }

    //Editar produto
    private static void editarProduto() {
        System.out.println("Digite o id que deseja alterar:");
        var id = Integer.parseInt(teclado.next());
        System.out.println("Edite para o preço desejado:");
        var preco = teclado.nextDouble();

        service.alterarPreco(id, preco);
        System.out.println("Produto atualizado com sucesso.");
        System.out.println("Pressione qualquer tecla e dê ENTER para voltar ao menu principal.");
        teclado.next();
    }

    //Excluir produto
    private static void excluirProduto() {
        System.out.println("Digite o id do produto:");
        var id = Integer.parseInt(teclado.next());
        service.excluir(id);
        System.out.println("Produto excluído com sucesso.");
        System.out.println("Pressione qualquer tecla e dê ENTER para voltar ao menu principal.");
        teclado.next();
    }
}

