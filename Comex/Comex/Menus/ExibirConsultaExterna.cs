using Comex.modelo;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.Json;
using System.Threading.Channels;
using System.Threading.Tasks;

namespace Comex.Menus;

internal class ExibirConsultaExterna : MenuPrincipal
{ 
    public void ListarProdutosExternos()
    {
        Console.Clear();

        RequisicaoApi requisao = new RequisicaoApi();    
        var resposta = requisao.Conexao().Result;
        var listaDeProdutos = JsonSerializer.Deserialize<List<Produto>>(resposta)!;

        listaDeProdutos.ForEach(produto => Console.WriteLine($"Id: {produto.Id} \n Produto:  {produto.Nome} \n Preco Unitario:" +
            $" {produto.PrecoUnitario} \n Quantidade: {produto.Quantidade}"));

        Console.WriteLine("\nDigite uma tecla para voltar ao menur principal");
        Console.ReadKey();
    }
}
