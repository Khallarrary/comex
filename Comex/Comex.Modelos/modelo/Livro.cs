using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Comex.modelo;

internal class Livro : Produto 
{
    public Livro(string nome) : base(nome) { }

    public string Isbn { get; }

    public string TotalDePaginas { get; }

    public override void Identificar()
    {
        Console.WriteLine("Nome do Livro: " + Nome);
        Console.WriteLine("ISBN do Livro: " + Isbn);
    }
}


