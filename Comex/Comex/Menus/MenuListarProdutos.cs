using Comex.modelo;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Comex.Menus;

internal class MenuListarProdutos : MenuPrincipal
{

    public void ListarProdutos(List<Produto> listaDeProdutos)
    {
        Console.WriteLine("Listar Produtos");
        foreach (var produto in listaDeProdutos)
        {
            Console.WriteLine(
            $"Nome: {produto.Nome}\n" +
            $"Descrição: {produto.PrecoUnitario}\n" +
            $"Quantidade: {produto.Quantidade}\n"
            );
        }

        Console.WriteLine("\nDigite uma tecla para voltar ao menu principal");
        Console.ReadKey();

        
    }
    public void ExibirListaDeProdutos(List<Produto> listaDeProdutos)
    {
        listaDeProdutos.ForEach(produto => Console.WriteLine(produto.ToString()));
    }
}
