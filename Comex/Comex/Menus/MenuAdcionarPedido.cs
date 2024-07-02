using Comex.modelo;
using System.Runtime.CompilerServices;

namespace Comex.Menus;

internal class MenuAdcionarPedido : MenuPrincipal
{
    public Pedido CadastrarPedido(List<Pedido> pedidos, List<Produto> produtos)
    {
        Console.WriteLine("Digite o nome do cliente: ");
        string nome = Console.ReadLine();
        Cliente cliente = new Cliente();
        cliente.Nome = nome;

        bool opcao = true;

        while (opcao)
        {
            Console.WriteLine("Digite 1 para visualizar a lista de produtos ou 0 para continuar: ");
            int opcaoEscolhida = int.Parse(Console.ReadLine()!);
            Console.WriteLine();
            switch (opcaoEscolhida)
            {
                case 0:
                    opcao = false;
                    break;
                case 1:
                    ExibirListaDeProdutos(produtos);
                    break;
                default:
                    Console.WriteLine("Opcao Invalida!");
                    break;
            }
            Console.WriteLine();
        }
        Pedido pedido = new(cliente);

        bool opcaoPedido = true;
        while (opcaoPedido)
        {
            Console.WriteLine("Digite o nome do produto para adcionar ao pedido: ");
            string nomeProduto = Console.ReadLine()!;

            while (!produtos.Exists(p => p.Nome.Contains(nomeProduto)))
            {
                Console.WriteLine("Produto inexistente");

                Console.WriteLine("Digite o nome do produto para adcionar ao pedido:  ");
                nomeProduto = Console.ReadLine()!;
            }

            var produto = produtos.Find(p => p.Nome == nomeProduto);
            Console.WriteLine("\n Digite a quantidade: ");
            int quantidade = int.Parse(Console.ReadLine()!);

            ItemPedido item = new(produto, quantidade);
            pedido.AdcionarItems(item);

            Console.WriteLine("Para adcionar mais produtos digite 1 ou 0 para continuar");
            int opcaoCadastrarItem = int.Parse(Console.ReadLine()!);

            if (opcaoCadastrarItem == 0)
            {
                opcaoPedido = false;

            }

        }

        Console.Write("\nPedido Cadastrado com sucesso!!!\n");
        Console.WriteLine($"\nDetalhes do pedido do cliente: -> {cliente.Nome}\n");
        pedido.ExibirDetalhesDoPedido();
        Console.WriteLine("\nDigite uma tecla para voltar ao menur principal");
        Console.ReadKey();

        return pedido;

    }
    private void ExibirListaDeProdutos(List<Produto> produtos)
    {
        produtos.ForEach(produtos => Console.WriteLine(produtos.ToString()));
    }
}
