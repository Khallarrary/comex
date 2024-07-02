using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Comex.modelo;

internal class Eletronico : Produto
{
    public Eletronico(string nome) : base(nome) { }
    
    public int Voltagem {  get; set; }
    public int Potencia { get; set; }

   
}

