package br.com.alura.farmacia2.principal;

import br.com.alura.farmacia2.modelo.Fabricante;
import br.com.alura.farmacia2.modelo.Produto;
import br.com.alura.farmacia2.repository.FabricanteRepository;
import br.com.alura.farmacia2.repository.ProdutoRepository;

import java.util.Optional;
import java.util.Scanner;

public class Principal {

    private ProdutoRepository produtoRepository;
    private FabricanteRepository fabricanteRepository;


    private static Scanner leitura = new Scanner(System.in);

    public Principal(ProdutoRepository produtoRepository, FabricanteRepository fabricanteRepository) {
        this.produtoRepository = produtoRepository;
        this.fabricanteRepository = fabricanteRepository;
    }

    public void exibeMenu(){
        var opcao = -1;

        while (true) {
            var menu = """
                    ********** Menu Farmácia **********
                                  
                    Selecione uma opção:
                    -------------------------------------------
                    |1 - Cadastrar novo produto.
                    |2 - Listar produtos.
                    |3 - Editar produto.
                    |4 - Deletar produto.
                    |5 - Sair.
                    -------------------------------------------
                  
                       """;

            System.out.println(menu);
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarProduto();

                case 2:
                    listarProdutos();
                    break;
                case 3:
                    editarProduto();
                    break;
                case 4:
                    deletarProduto();
                    break;
                case 5:
                    System.out.println("Encerrando aplicação...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

        private void cadastrarProduto(){
            System.out.println("Informe o nome do Fabricante: ");
            var nomeFabricante = leitura.nextLine();
            var fabricantes = new Fabricante(nomeFabricante);
            fabricanteRepository.save(fabricantes);

            System.out.println("Informe o nome do Produto: ");
            var nomeProduto = leitura.nextLine();

            System.out.println("Informe a descrição do Produto: ");
            var descricaoProduto = leitura.nextLine();

            System.out.println("Informe o valor do Produto: ");
            var valorProduto = leitura.nextDouble();

            var produto = new Produto(nomeProduto, descricaoProduto, valorProduto, fabricantes);

            produtoRepository.save(produto);
            System.out.println("Produto cadastrado com sucesso! \n");
        }

        private void listarProdutos(){
            var produtos = produtoRepository.findAll();
            produtos.forEach(produto -> System.out.println(produto));
        }

        private void editarProduto(){
            System.out.println("Digite o Id do produto para editar: ");
            var id = leitura.nextInt();
            leitura.nextLine();

            Optional<Produto> byId = produtoRepository.findById(id);
            if(byId.isEmpty()) {
                System.out.println("Produto inexistente!");
            } else {
                System.out.println("Informe a nova descrição");
                var descricaoProduto = leitura.nextLine();
                var produto = byId.get();
                produto.setDescricao(descricaoProduto);
                produtoRepository.save(produto);
                System.out.println("Produto atualizado com sucesso!!! \n");
            }

        }

        private void deletarProduto(){
            System.out.println("Digite o Id do produto para deletar: ");
            var id = leitura.nextInt();
            leitura.nextLine();

            Optional<Produto> byId = produtoRepository.findById(id);
            if (byId.isEmpty()) {
                System.out.println("Produto inexistente");
            } else {
                produtoRepository.deleteById(id);
                System.out.println("Produto deletado com sucesso! \n");
            }
        }

}
