using Comex.modelo;
using System;

namespace Comex.Menus;

internal class MenuPrincipal
{

    List<Produto> listaDeProdutos = new List<Produto>();
    public virtual void ExecutarMenu()
    {
        Console.WriteLine("\nDigite 1 para cadastrar Produto");
        Console.WriteLine("Digite 2 para listar todas os produtos");
        Console.WriteLine("Digite 3 para exibir lista de produtos externa");
        Console.WriteLine("Digite 0 para sair");


        string opcaoEscolhida = Console.ReadLine()!;
        int opcaoEscolhidaNumerica = int.Parse(opcaoEscolhida);

        switch (opcaoEscolhidaNumerica) {

            case 1:
                RegistrarProduto menuUm = new();
                listaDeProdutos.Add(menuUm.CadastrarProduto());
                break;
            case 2:
                MenuListarProdutos menuDois = new();
                menuDois.ListarProdutos(listaDeProdutos);
                break;
            case 3:
                ExibirConsultaExterna menuTres = new();
                menuTres.ListarProdutosExternos();
                break;
            case 0:
                Console.WriteLine("Bye Bye");
                break;
            default:
                Console.WriteLine("Opção Invalida!");
                break;
        
        }
    }
}