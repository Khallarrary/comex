using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.Json.Serialization;
using System.Threading.Tasks;

namespace Comex.modelo;

public class Produto : Identificavel
{
    [JsonPropertyName("id")]
    public int Id { get; set; }
    [JsonPropertyName("title")]
    public string Nome { get; set; }
    [JsonPropertyName("price")]
    public double PrecoUnitario { get; set; }
    [JsonPropertyName("count")]
    public double Quantidade { get; set; }

    public Produto(string nome)
    {
        Nome = nome;
    }

    
    public static void ExibirProduto(Produto produto)
    {
        Console.WriteLine("ID: " + produto.Id);
        Console.WriteLine("Nome: " + produto.Nome);
        Console.WriteLine("Preço: " + produto.PrecoUnitario);
        Console.WriteLine("Quantidade: " + produto.Quantidade);
    }

    public virtual void Identificar() { }

}
