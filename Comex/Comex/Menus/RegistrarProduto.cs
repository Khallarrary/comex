using Comex.modelo;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Comex.Menus;

internal class RegistrarProduto : MenuPrincipal
{
    public Produto CadastrarProduto()
    {
        Console.Clear();
        Console.WriteLine("Registro de produtos");

        Console.Write("Digite o nome do produto: ");
        String nomeProduto = Console.ReadLine()!;

        Produto produto = new Produto(nomeProduto);

        Console.WriteLine($"O Produto {nomeProduto} foi cadastrado com sucesso");

        Thread.Sleep(2000);

        return (produto);

        Console.Clear();
    }
}
